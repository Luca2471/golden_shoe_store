<template>
  <div>
    <ShoeDetail :selectedShoe="selectedShoe" :active="active" v-on:close-shoe-detail="closeShoeDetail"/>

    <div class="shoe-details-box" >
      <ShoesDetails v-for="shoe in shoes" :key="shoe.id" :shoe="shoe" v-on:view-shoe="viewShoe($event)"/> 
    </div>
  </div>
</template>

<script>
import GoldenShoeService from '../services/GoldenShoeService.js';
import ShoesDetails from '../components/ShoesDetails.vue';
import ShoeDetail from '../components/ShoeDetail.vue';

export default {
  name: 'styles',
  components: {
    ShoesDetails,
    ShoeDetail,
  },
  data() {
    return {
      shoes: [],
      selectedShoe: null,
      active: false,
      style: null,
      previousUrl: this.$route.path,
      currentUrl: this.getCurrentURL,
    }
  },

  methods: {
    getAllShoes() {
      this.shoes = [];
      const getUrl = window.location.href.split("/");
      if (getUrl.length === 4) {
        GoldenShoeService.getModels()
        .then(res => this.shoes = res);
      } else if (getUrl.length === 5) {
        this.style = getUrl[4];
        GoldenShoeService.getShoesByStyle(this.style)
        .then(res => {
          let shoesByStyle = res[0].shoeModels
           for (const shoe of shoesByStyle) {
            const newShoe = {
              color: shoe.color,
              gender: shoe.gender,
              id: shoe.id,
              model: shoe.model,
              price: shoe.price,
              quantity: shoe.quantity,
              shoeURL: shoe.shoeURL,
              shoeURLSmall: shoe.shoeURLSmall,
              shoeType: {
                category: this.style
              }
            }
            this.shoes.push(newShoe);
          }
        })
      }
    },

    viewShoe(shoe) {
      this.selectedShoe = shoe;
      this.active = true;
    },

    closeShoeDetail() {
      this.active = false;
    },
  },

  computed: {
    getCurrentURL() {
      if (this.currentUrl !== this.previousUrl) {
        this.getAllShoes();
      }
      return this.$route.path;
    },
  },

  mounted() {
    this.getAllShoes();
  }
}
</script>

<style lang="scss">

.shoe-details-box {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  background-color: #D9DDDE;
}

</style>