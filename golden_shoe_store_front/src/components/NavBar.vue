<template>
  <div>
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <div style="text-align:right; padding: 5px; background-color: #e0e0e0">
    <a>Help</a> | <a >Hello, {{user.name}}</a>

    <i class="fa fa-shopping-basket" style="font-size:24px; padding:5px"></i>
    </div>

    <div class="nav-bar">
      <ul>
        <li v-for="category in categories" v-on:click="onClickShowCategory(category)">
          <a>{{ category }}</a>
        </li>
      </ul>
    </div>
    
    <div class="drop-down">
      <a>Hello world</a>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'nav-bar',
    data() {
      return {
        categories: ["Men", "Women", "Kids", "Style", "Offers"],
        user: {name: "Luca", url: "help"},
      }
    },

    methods: {
      onClickShowCategory(category) {
        console.log('category: ', category)
      }
    }
  }
</script>

<style lang="css" scoped> 

li {
  display: inline;
  padding: 30px;
}

li a {
  color: #000;
}

li a:hover {
  color: #000;
  border-bottom: 5px solid black;
}

.nav-bar {
  padding: 20px;
  background-color: #e0e0e0;
  overflow: hidden;
  text-align: center;
}

.drop-down {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  z-index: 1;
}

.drop-down a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block
}



</style>

