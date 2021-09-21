<template>
  <div class="shpping-basket">
    <div class="product-container">

    </div>
    <h1>Welcome to the shopping cart!</h1>
     <h4 v-for="item in shoppingCart">${{item.price}}</h4>

     <a>Total: £{{ getTotal }}</a>
  </div>
</template>

<script>
export default {
  name: "shopping-basket",
  data() {
    return {
      shoppingCart: [],
      subTotal: null,
    }
  },
  computed: {
    getTotal: function() {
      let total
      let values
      if (this.shoppingCart.length === 0) {
        total = 0;
      } else { 
        total = this.shoppingCart.reduce(function (accumulator, item) {
          return accumulator + parseFloat(item.price);
        }, 0);
      }
      return total.toFixed(2);
    },
  },
  methods: {
  },
}

</script>

<style lang="scss" scoped>
.product-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center
}

</style>