import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import Basket from "../views/Basket.vue";
import ShoesList from "../views/ShoesList.vue";
import Men from "../views/Men.vue";
import Women from "../views/Women.vue";
import Kids from "../views/Kids.vue";
import Styles from "../views/Styles.vue";
import Sales from "../views/Sales.vue";

const routes = [
  {
    path: '/',
    name: 'Home',
    alias: ['/New%20Releases/:Style'],
    component: Home
  },
  {
    path: '/Basket',
    name: 'Basket',
    component: Basket
  },
  {
    path: '/Shoes',
    name: 'ShoesList',
    
    component: ShoesList
  },
  {
    path: '/Women',
    name: 'Women',
    alias: ['/Women/:Style'],
    component: Women
  },
  {
    path: '/Kids',
    name: 'Kids',
    alias: ['/Kids/:Style'],
    component: Kids
  },
  {
    path: '/Men',
    name: 'Men',
    alias: ['/Men/:Style'],
    component: Men
  },
  {
    path: '/Styles',
    name: 'Styles',
    alias: ['/Styles/:Style'],
    component: Styles
  },
  {
    path: '/Sales',
    name: 'Sales',
    alias: ['/Sales/:Style'],
    component: Sales
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
