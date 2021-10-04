<template>
  <div>
    <ShoeDetail :selectedShoe="selectedShoe" :active="active" v-on:close-shoe-detail="closeShoeDetail"/>

    <div class="shoe-details-box" >
      <ShoesDetails v-for="shoe in shoes" :key="shoe.id" :shoe="shoe" v-on:view-shoe="viewShoe($event)">Hello </ShoesDetails> 
    </div>
  </div>
</template>

<script>
import GoldenShoeService from '../services/GoldenShoeService.js';
import ShoesDetails from '../components/ShoesDetails.vue';
import ShoeDetail from '../components/ShoeDetail.vue';

export default {
  name: 'sales',
  components: {
    ShoesDetails,
    ShoeDetail,
  },
  data() {
    return {
      shoes: [],
      selectedShoe: null,
      active: false,
      previousUrl: this.$route.path,
      currentUrl: this.getCurrentURL,
    }
  },

  methods: {
    getAllShoes() {
      GoldenShoeService.getModels()
      .then(res => this.shoes = res);
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