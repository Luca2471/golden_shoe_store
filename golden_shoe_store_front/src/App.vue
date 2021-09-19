<template>
  <div id="app">
    <nav-bar></nav-bar>

    <img src="./assets/shoe-home-page-image.jpeg" alt="close up photo of a sneaker" style="width:100%;height:800px; margin:0">

    <info-bar style="margin:0"></info-bar>
  </div>
</template>

<script>
import NavBar from "./components/NavBar.vue";
import InfoBar from "./components/InfoBar.vue";

export default {
  name: 'App',
  data() {
    return {
      shoppingCart: [],
    }
  },
  components: {
    "nav-bar": NavBar,
    "info-bar": InfoBar,
  }
}
</script>

<style>
*{
  margin: 0
}
#app {
  margin: 0;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}
</style>
