<template lang="html">
  <NavBar id="nav" />
  <router-view />
  <InfoBar />
</template>

<script>
import NavBar from "./components/NavBar.vue";
import InfoBar from "./components/InfoBar.vue";

export default {
  name: 'app',
  components: {
    NavBar,
    InfoBar,
  },

  mounted() {
    this.$store.commit('updateBasketFromLocalStorage');
  }
}
</script>

<style lang="scss"> 

@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css');

i {
  cursor: pointer;
}

a {
  cursor:pointer;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

html, body {
  margin: 0;
  padding: 0;
  overflow-x: hidden;
}

body {
  background-color: #D9DDDE;
}

#nav {
  width: 100%;
  height: 100%;
  background-color: #D9DDDE;
  line-height: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;
    text-decoration: none;
    margin: 0 5px 0 5px;
    font-size: 1.25rem;
  }
}

.text-align-center {
  text-align: center;
}

</style>
