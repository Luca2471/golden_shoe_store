<template>
  <div class="shoe-card" @click="$emit('view-shoe', shoe)">
    <img :src="shoe.shoeURL" class="regular-image">
    <img :src="shoe.shoeURLSmall" class="small-image">
    <h3>{{ shoe.model }}</h3>
    <h5 class="gender">{{ shoe.gender}}'s {{ shoe.shoeType.category }} Shoes</h5>
    <h4 class="price">£{{ shoe.price }} 
      <small class="text-muted" v-if="shoe.quantity < 3 && shoe.quantity > 0">Only {{ shoe.quantity }} left in stock</small>
      <small class="text-muted" v-if="shoe.quantity === 0">This item is out of stock</small>
    </h4>
  </div>
</template>

<script>
export default {
  name: 'shoes-details',
  props: ['shoe'],
}
</script>

<style lang="scss">

.shoe-card {
  cursor: pointer;
  text-align: left;
  width: 330px;
  margin: 30px 4px 3px;
  padding-top: 10px;
  height: 100%;
  background-color: #D9DDDE;
  
  img.regular-image {
    display: block;
  }

  img.small-image {
    display: none;
  }

  h5.gender {
    color: gray;
  }

  .text-muted { 
    padding-left: 10px;
    color: gray;
  }
}

@media screen and (max-width: 760px) {
  
  .shoe-card {
    margin: 30px 0.5px 3px;
    width: 204px;
    margin: 0.5px;
    height: 100%;

    img.regular-image {
     display: none;
    }

    img.small-image {
    display: block;
    }
  }
}
</style>