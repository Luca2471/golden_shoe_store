<template>
  <div class="basket-shoe-card">
    <div>
      <img :src="shoe.shoeURL" class="regular-image" >
      <img :src="shoe.shoeURLSmall" class="small-image" >
    </div>

    <div class="header">
      <h3>{{ shoe.model }}</h3>
      <h4>Price: £{{ shoe.price }}</h4>
      <h4>In basket: {{ shoe.amount }}</h4>
      <h4>Total cost: £{{ totalCostOfSameShoes.toFixed(2) }}</h4>
    </div>
  </div>
</template>

<script>
export default {
  name: 'basket-item',
  props: ['shoe'],

  computed: {
    totalCostOfSameShoes() {
      return this.shoe.price * this.shoe.amount;
    },
  }
}
</script>

<style lang="scss" >

.basket-shoe-card {
  height: 330px;
  width: 400px;
  border: 1px solid black;
}

img.small-image {
  display: none;
}

@media screen and (max-width: 759px) {

  img.regular-image {
    display: none;
  }

  img.small-image {
    display: block;
  }

  .basket-shoe-card {
    height: 204;
    width: 300px;
  }
}
</style>