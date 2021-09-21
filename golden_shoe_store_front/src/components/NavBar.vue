<template>
  <div>
    <nav style="text-align:right;">
      <a>Help</a> | <a >Hello, {{user.name}}</a>
      <i class="fa fa-shopping-basket" @click="goToShoppingBasket()" style="font-size:24px; padding:2% 2% 0 1%; cursor: pointer;"></i>
    </nav>

     <figure @click="toggleNav()">
        <i class="fa fa-bars" ></i>
      </figure>

    <nav>
      <ul ref="nav">
        <li style="text-align:center; cursor: pointer;" v-for="(category, index) in categories" :key="index" @click="displayShoeStyles(category)">
          <a >{{ category.name }}</a>
          <i class="fa fa-angle-right"></i>
        </li>
      </ul>
    </nav>

    <nav>
      <ul ref="styles" class="styles-list">
        <i @click="toggleNav()" style="text-align:left; padding-left:8%; padding-bottom:4%" class="fa fa-angle-left"></i>
        <li v-for="(style, index) in shoeStyles" :key="index" @click="goToSelectedPage(style)">
          <a>{{ style.category }}</a><i class="fa fa-angle-right"></i>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
import GoldenShoeService from "../services/GoldenShoeService.js";

export default {
  name: 'nav-bar',
  data() {
    return {
      shoeStyles: [],
      categories: [
        {
          name: "Home",
          id: 1
        },
        {
          name: "Men", 
          id: 2
        }, 
        {
          name: "Women", 
          id: 3
        }, 
        {
          name: "Kids", 
          id: 4
        }, 
        {
          name: "Styles", 
          id: 5
        }, 
        {
          name: "Offers", 
          id: 6
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

    goToShoppingBasket() {
      console.log("Hello World")
    },

    goToSelectedPage(selectedStyle) {
      console.log(selectedStyle.shoeModels)
    },

    displayShoeStyles(category) {
      console.log(category.id)
      if (!(category.id === 1 || category.id === 6)) {
        const styles = this.$refs.styles.classList;
        styles.contains('display') ? styles.remove('display') : styles.add('display');

        const nav = this.$refs.nav.classList;
        nav.remove('active');
      }
    },

    toggleNav() {
      const nav = this.$refs.nav.classList;
      nav.contains('active') ? nav.remove('active') : nav.add('active');

      const styles = this.$refs.styles.classList;
      styles.remove('display')
    },

     fetchShoeStyles() {
      GoldenShoeService.getStyles()
      .then(res => this.shoeStyles = res);
    },
  },
  mounted() {
    this.fetchShoeStyles();
  },
}
</script>

<style lang="scss" scoped> 
figure {
  visibility: hidden;
}

.styles-list {
  list-style-type:none;
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

      i {
        visibility: hidden;
      }
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

.styles-list {
  justify-content: start;
  background-color: #e0e0e0;
  opacity: 0.93;
  position: absolute;
  width: 80%;
  length: 100%;
  flex-direction: column;
  left: -100%;
  top: 80px;
  transition: 300ms ease all;
  margin-left: 0%;
  &.display {
    visibility: visible;
    left: 0px;
  }
}

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
      background-color: #e0e0e0;
      opacity: 0.93;
      position: absolute;
      width: 80%;
      length: 100%;
      flex-direction: column;
      left: -100%;
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

        i {
          visibility: visible;
        }
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

