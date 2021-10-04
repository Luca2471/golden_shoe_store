<template>
  <div class="check-out-box">
    <h3>Total: {{ totalInBasket.toFixed(2) }}</h3>

    <button class="checkout-button">Proceed to checkout</button>
  </div>
</template>

<script>
export default {
  name: 'basket-checkout',
  props: ['shoes'],
  computed: {
    totalInBasket() {
      return this.$store.getters.totalInBasket;
    },
  }
}
</script>

<style lang="scss" >

.checkout-button {
  cursor: pointer;
  padding: 10px;
  background-color: black;
  border: none;
  color: white;
  font-weight: bold;
  font-size: 1.15rem;
  border-radius: 5px;
}

</style>
