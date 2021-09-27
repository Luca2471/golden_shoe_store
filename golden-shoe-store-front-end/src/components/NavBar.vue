<template>
  <div>
    <nav style="text-align:right;">
      <router-link to="/">Hello, {{user.name}}</router-link >
      <router-link to="/Basket">
        <i class="fa fa-shopping-basket" style="color:#2c3e50;font-size:24px; padding:2% 2% 0 1%; cursor: pointer;"></i>
      </router-link>
    </nav>

    <nav>
      <figure ref="nav">
        <i @click="toggleNav()" class="fa fa-bars" ></i>
      </figure>
      
      <ul ref="nav">
        <li style="text-align:center; cursor: pointer;" v-for="category in categories" :key="category.id" @click="displayShoeStyles(category)">
          <div class="dropdown">
          <a class="mobile">{{ category.name }}</a>
          <router-link :to="category.url" class="desktop">{{ category.name }}</router-link>
            <div class="dropdown-content">
              <router-link v-for="style in shoeStyles" :key="style.id" @click="goToCategoryPage(style)" class="router-link" :to="this.selectedUrl">
                {{ style.category }}
              </router-link>
            </div>
          </div>
        </li>

        <div class="drop-down">
            <a v-for="style in shoeStyles" :key="style.id" @click="goToCategoryPage(style)">
              <router-link class="router-link" :to="this.selectedUrl">
                {{ style.category }}
              </router-link>
            </a>
        </div>
      </ul>
    </nav>

    <nav>
      <ul ref="styles" class="styles-list">
        <i @click="toggleNav()" style="text-align:left; padding-left:8%; padding-bottom:4%" class="fa fa-angle-left"></i>
        <li v-for="style in shoeStyles" :key="style.id" @click="goToCategoryPage(style)">
          <router-link class="router-link" :to="this.selectedUrl">
            <a >{{ style.category }}</a>
          </router-link>
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
      selectedCategory: null,
      selectedUrl: "",
      categories: [
        {
          name: "New Releases", 
          url: '/Shoes',
          styles: "",
          id: 1
        },
        {
          name: "Men", 
          url: '/Men',
          styles: this.shoeStyles,
          id: 2
        }, 
        {
          name: "Women", 
          url: '/Women',
          styles: this.shoeStyles,
          id: 3
        }, 
        {
          name: "Kids", 
          url: '/Kids',
          styles: this.shoeStyles,
          id: 4
        }, 
        {
          name: "Styles", 
          url: '/Styles',     
          styles: this.shoeStyles,    
          id: 5
        }, 
        {
          name: "Sales", 
          url: '/Sales',
          styles: "",
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
    goToCategoryPage(style) {
      this.selectedUrl = `/${this.selectedCategory}/${style.category}`
      const nav = this.$refs.nav.classList;
      nav.remove('active');
      const styles = this.$refs.styles.classList;
      styles.remove('display')
    },

    displayShoeStyles(category) {
      this.selectedCategory = category.name

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
.drop-down {
  display: none
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #D9DDDE;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #D9DDDE;}

.mobile {
    visibility: hidden;
    display: none;
}


figure {
  visibility: hidden;

}
.desktop {
  visibility: visible;
  text-align: center;
  text-decoration: none;
  color: #000;
  align-items: center;
}
.styles-list {
  list-style-type:none;
  visibility: hidden;
}

.styles-list:hover{
  visibility: hidden;
}

nav {
  height: 60px;
  text-align: center;

  ul {
    justify-content: space-between;
    display: flex;
    height: 30px;
    margin-block-start: 0;
    margin-block-end: 0;
    padding-inline-start: 0;
    margin-left: 10%;
    margin-right: 10%;

    ul:hover {
      div {
        display: block;
        font-size: 2rem;
      }
    }

    a {
      text-align: center;
      text-decoration: none;
      color: #000;
      align-items: center;
    }

    i {
      font-size: 30px;
    }

    li:hover {
      text-decoration: underline;
    }

    li {
      justify-content: space-between;
      list-style-type:none;
      display: flex;
      padding: 10px 20px;

      .on-hover-drop-dow {
        display: none;
      }

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
  background-color: #D9DDDE;
  z-index: 1;
}

.drop-down a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block
}

@media screen and (max-width: 759px) {

.desktop {
    visibility: hidden;
}

.drop-down {
  display: none
}

.dropdown {
}

.dropdown-content {
}

.dropdown-content a {

}

.dropdown-content a:hover {
  display: none;
}

.dropdown:hover .dropdown-content {
  display: none;
}

.dropdown:hover .dropbtn {
  display: none
}

.styles-list {
  justify-content: start;
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
  &.active {
    visibility: hidden;
  }
  i {
    font-size: 40px
  }
  
}

 .mobile {
  visibility: visible;
  display: block;
}

  nav {
      height: 40px;
    ul {
      justify-content: start;
      background-color: #D9DDDE;
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
        background-color: #D9DDDE;
        width: 100%;
        padding-left: 0;
        padding-right: 0;

        .router-link {
          i {
            visibility: visible;
            padding-right: 3%;
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
  }
}

// .top-section-nav {
//   text-align:right;
// }


// .styles-list {
//   list-style-type: none;
//   visibility: hidden;
// }

// nav {
//   height: 100vh;
//   width: 100%;
//   overflow: hidden;
//   text-align: center;
  
//   i {
//     visibility: hidden;
//     font-size: 30px;
//   }

//   ul {
//     justify-content: space-between;
//     display: flex;
//     height: 100%;
//     margin-block-start: 0;
//     margin-block-end: 0;
//     padding-inline-start: 0;
//     margin-left: 10%;
//     margin-right: 10%; 

//     li:hover {    
//       border-bottom: 5px solid black;
//     }

//     li {
//       justify-content: space-between;
//       list-style-type:none;
//       display: flex;
//       padding: 10px 20px;

//       i {
//         visibility: hidden;
//       }
//     }
//   }
// }

// .drop-down {
//   display: none;
//   position: absolute;
//   background-color: #2c3e50;
//   z-index: 1;
// }

// .drop-down a {
//   color: black;
//   padding: 12px 16px;
//   text-decoration: none;
//   display: block
// }

// @media screen and (max-width: 759px) {

// .styles-list {
//   position: absolute;
//   background-color: #D9DDDE;
//   position: absolute;
//   width: 80%;
//   height: 100%;
//   length: 100%;
//   flex-direction: column;
//   left: -100%;
//   top: 80px;
//   transition: 300ms ease all;
//   margin-left: 0%;
//   &.display {
//     visibility: visible;
//     left: -10px;
//   }
//    li {
//       width: 100%;
//       padding-left: 0;
//       padding-right: 0;
//     a{
//     flex-direction: row;
//             margin-left: 0px;
//             justify-content: space-between;
//             margin-right: 13px;
//     }
//    }
// }

// figure {
//   visibility: visible;
//   position: absolute;
//   z-index: 1;
//   top: 1px;
//   left: -25px;
 
// }

// nav {
//     i {
//       visibility: visible;
//       position: absolute;
//       z-index: 1;
//       top: 1px;
//       left: -25px;
//       font-size: 40px
//     }
//       height: 40px;
//     ul {
//       padding-top: 60px;
//       justify-content: start;
//       background-color: #D9DDDE;
//       position: absolute;
//       width: 80%;
//       length: 100%;
//       flex-direction: column;
//       left: -100%;
//       top: 80px;
//       transition: 300ms ease all;
//       margin-left: 0%;
//       &.active {
//         left: 0px;
//       }

//       li {
//         width: 100%;
//         padding-left: 0;
//         padding-right: 0;
        
//         .router-link {
//           i {
//             visibility: visible;
//           }
//           a {
//             flex-direction: row;
//             margin-left: 20px;
//             justify-content: space-between;
//             margin-right: 13px;
//           }
//         }
//       }
//     }
//   }
// }

</style>
