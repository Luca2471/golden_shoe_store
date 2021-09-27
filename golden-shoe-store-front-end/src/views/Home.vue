<template>
  <img src="../assets/home-screen-background-image.jpeg">
</template>

<script>
// import GoldenShoeService from '../services/GoldenShoeService.js';

export default {
  name: 'Home',
  components: {
  },
  data() {
    return {
    }
  },

  methods: {
    // getAllShoes() {
    //   GoldenShoeService.getModels()
    //   .then(res => this.shoes = res);
    // }
  },
  mounted() {
    // this.getAllShoes();
  },
}
</script>

<style  lang="scss" scoped>
img {
    width: 100%;
    height: 100%;
}
</style>
