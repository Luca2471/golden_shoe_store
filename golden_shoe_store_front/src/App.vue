<template>
  <div id="app">
    <nav-bar></nav-bar>
    <figure class="background-image" v-if="displayHomePage">
      <img  src="./assets/shoe-home-page-image.jpeg" alt="close up photo of a white sneaker">
    </figure>

    
    <info-bar></info-bar>
  </div>
</template>

<script>
import NavBar from "./components/NavBar.vue";
import InfoBar from "./components/InfoBar.vue";
import ShoppingBasket from "./components/ShoppingBasket.vue";
import ShoesList from "./components/ShoesList.vue";

export default {
  name: 'App',
  data() {
    return {
      displayHomePage: false,
      displayShoppingCart: true,
    }
  },
  components: {
    "nav-bar": NavBar,
    "info-bar": InfoBar,
    "shopping-basket": ShoppingBasket,
    "shoes-list": ShoesList,
  },
  methods: {
  }
}
</script>

<style style="scss">
@import 'https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css';

body{
  margin: 0;
}
#app {
  margin: 0;
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  background-color: #e0e0e0;
}

.shoping-basket-display {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.background-image {
  display: block;
  height: 100%;
  width:100%;
  margin:0; 
  overflow: hidden;
}

.shoes-list-display {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}
</style>
