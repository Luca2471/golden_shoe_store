<template>
  <div >
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
  name: 'kids',
  components: {
    ShoesDetails,
    ShoeDetail,
  },
  data() {
    return {
      shoes: [],
      selectedShoe: null,
      active: false,
      category: {
        gender: null,
        style: null,
      },
      previousUrl: this.$route.path,
      currentUrl: this.getCurrentURL,
    }
  },

  methods: {
    getAllShoes() {
    const getUrl = window.location.href.split("/");
    this.category.gender = getUrl[3];
      if (getUrl.length === 4) {
        GoldenShoeService.getShoesByGender(this.category.gender)
        .then(res => this.shoes = res);
      } else if (getUrl.length === 5) {
        this.category.style = getUrl[4];
        GoldenShoeService.getModelsByGenderAndStyle(this.category.gender, this.category.style)
        .then(res => this.shoes = res);
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