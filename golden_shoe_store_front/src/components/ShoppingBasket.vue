<template>
  <div class="shpping-basket">
    <div class="product-container">

    </div>
    <h1>Welcome to the shopping cart!</h1>
     <h4 v-for="item in shoppingBasket">${{item.price}}</h4>
      <button @click="clearBasket()">Clear basket</button>
     <a>Total: £{{ getTotal }}</a>
  </div>
</template>

<script>
import { eventBus } from "../main.js";

export default {
  name: "shopping-basket",
  data() {
    return {
      shoppingBasket: [],
      subTotal: 0,
    }
  },
  computed: {
    getTotal: function() {
      let total
      let values
      total = this.shoppingBasket.reduce(function (accumulator, item) {
        return accumulator + parseFloat(item.price);
      }, 0);
      return total.toFixed(2);
    },
  },
  methods: {

    clearBasket() {
      this.shoppingBasket = [];
    }
  },

  mounted() {
    eventBus.$on('add-shoe-to-basket', shoe => this.shoppingBasket.push(shoe))
  }
}

</script>

<style lang="scss" scoped>
.product-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center
}

</style>