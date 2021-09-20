<template>
  <div>
    <nav style="text-align:right;">
      <a>Help</a> | <a >Hello, {{user.name}}</a>
      <i class="fa fa-shopping-basket" style="font-size:24px; padding:2% 2% 0 1%; cursor: pointer;"></i>
    </nav>

     <figure @click="toggleNav()">
          <i class="fa fa-bars" ></i>
        </figure>

    <nav>
      <ul ref="nav">
        <li style="text-align:center;" v-for="(category, index) in categories" :key="index" @click="onClickShowCategory(category)">
          <a >{{ category.name }}</a>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
  export default {
    name: 'nav-bar',
    data() {
      return {
        categories: [
          {
            name: "Men", 
            id: 1
          }, 
          {
            name: "Women", 
            id: 2
          }, 
          {
            name: "Kids", 
            id: 3
          }, 
          {
            name: "Styles", 
            id: 4
          }, 
          {
            name: "Offers", 
            id: 5
          }
        ],
        user: {
          name: "Luca", 
          url: "help"
        },
      }
    },

    methods: {
      onClickShowCategory(category) {
        console.log('category: ', category.name)
      },

      toggleNav() {
        const nav = this.$refs.nav.classList;
        console.log('active');
        nav.contains('active') ? nav.remove('active') : nav.add('active');
      }
    }
  }
</script>

<style lang="scss" scoped> 
figure {
  visibility: hidden;
}

nav {
  height: 60px;
  width: 100%;
  background-color: #e0e0e0;
  overflow: hidden;
  text-align: center;

  ul {
    justify-content: space-between;
    display: flex;
    height: 100%;
    margin-block-start: 0;
    margin-block-end: 0;
    padding-inline-start: 0;
    margin-left: 10%;
    margin-right: 10%; 
    a {
      text-align: center;
      text-decoration: none;
      color: #000;
      align-items: center;
    }

    i {
      font-size: 30px;
    }

    a:hover {    
      border-bottom: 5px solid black;
      align-items: center;
    }

    li {
      justify-content: space-between;
      list-style-type:none;
      display: flex;
      padding: 10px 20px;
    }
  }
}

a {
  cursor: pointer;
}

figure {
    cursor: pointer;
}

.drop-down {
  display: none;
  position: absolute;
  background-color: #2c3e50;
  z-index: 1;
}

.drop-down a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block
}

@media screen and (max-width: 759px) {

figure {
  visibility: visible;
  position: absolute;
  z-index: 1;
  top: 1px;
  left: -25px;
  i {
    font-size: 40px
  }
}

  nav {
      height: 40px;
    ul {
      justify-content: start;
      background-color: #2c3e50;
      opacity: 0.93;
      position: absolute;
      width: 140px;
      length: 100%;
      flex-direction: column;
      left: -300px;
      top: 80px;
      transition: 300ms ease all;
      margin-left: 0%;
      &.active {
        left: 0px;
      }

      li {
        width: 100%;
        padding-left: 0;
        padding-right: 0;
      }

      a {
        flex-direction: row;
        margin-left: 20px;
        justify-content: space-between;
        margin-right: 13px;
      }
    }
  }
}

</style>

