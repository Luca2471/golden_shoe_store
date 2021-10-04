<template>
  <div>
    <h1 class="basket-title">YOUR BASKET</h1>

    <BasketCheckout @click="clearBasket()" :shoes="shoes"/>

    <div v-for="shoe in shoes" :key="shoe.id">
      <BasketItem class="shoe-basket"  :shoe="shoe" @click="viewShoe(shoe)" v-on:view-shoe="viewShoe($event)" />
      <button @click="removeShoeFromBasket(shoe)" class="remove-button" >Remove</button>    
    </div>

    <button class="clear-basket" @click="clearBasket()">Clear Basket</button>
    <ShoeDetail :selectedShoe="selectedShoe" :active="active" v-on:close-shoe-detail="closeShoeDetail" />
  </div>
</template>

<script>
import BasketItem from '../components/BasketItem.vue'
import BasketCheckout from '../components/BasketCheckout.vue'
import ShoeDetail from '../components/ShoeDetail.vue';

export default {
  name: 'basket',
  data() {
    return {
      selectedShoe: null,
      active: false,
    }
  },
  components: {
    BasketItem,
    BasketCheckout,
    ShoeDetail,
  },

  methods: {
    viewShoe(shoe) {
      this.selectedShoe = shoe;
      this.active = true;
    },

    closeShoeDetail() {
      this.active = false;
    },

    clearBasket() {
      this.$store.commit('clearBasket');
      return this.$store.getters.basketItems;
    },

    removeShoeFromBasket(shoe) {
      this.$store.commit('removeFromBasket', shoe);
      return this.$store.getters.basketItems;
    },
  },

  computed: {
    shoes() {
      return this.$store.getters.basketItems;
    },
  },
}
</script>

<style>

.remove-button {
  cursor: pointer;
  display: inline;
  background-color: #D9DDDE;
  border: none;
  right: 300px;
  padding-bottom: 30px;
}

.clear-basket {
  cursor: pointer;
  padding: 10px 20px;
  background-color: #2c3e50;
  border: none;
  right: 2000px;
  color: white;
  font-weight: bold;
  font-size: 1.15rem;
  border-radius: 5px;
}

.basket-title {
  font-weight: bold;
}

.shoe-basket {
  border: none;
  cursor:pointer;
  display: flex;
  justify-content: center;
  margin: 15px;
  width: 500px;
}

@media screen and (max-width: 759px) {

  .shoe-basket {
    margin: 15px;
    width: 360px;
    height: 204.5px;
  }
}

</style>