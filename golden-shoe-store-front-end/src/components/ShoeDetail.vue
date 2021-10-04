<template>
  <div class="card-background" :class="{show: active}" @click="$emit('close-shoe-detail')" />

  <div class="card" :class="{show: active}">
    <div class="close-card" @click="$emit('close-shoe-detail')">
      X
    </div>
  
    <div v-if="selectedShoe" class="shoe-detail">
      <h3 class="text-center">{{ selectedShoe.model }}</h3>
      <img :src="selectedShoe.shoeURL" class="regular-image">
      <img :src="selectedShoe.shoeURLSmall" class="small-image">
      <p class="description">In stock: {{ selectedShoe.quantity }}</p>
      <p class="description">This item is out of stock!</p>
      <h3 class="text-center">£{{ selectedShoe.price }}</h3>
      <div class="button-container" v-if="selectedShoe.quantity !== 0" >
        <button class="add" @click="addToBasket()">Add to basket</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'shoe-detail',
  props: ['selectedShoe', 'active'],
  methods: {
    addToBasket() {
      this.$store.commit('addToBasket', this.selectedShoe);
    },
  },
}
</script>

<style lang="scss" scoped >

.card-background {
  width: 100%;
  height: 100vh;
  position: fixed;
  left: 0;
  top: 0;
  z-index: 2;
  display: none;
  trasition: display .5s;

  &.show {
    display: block;
  }
}

.small-image {
  display: none;
}

.regular-image {
  display: block;
  width: 400px;
  height: 400px;
}

.card {
  width: 97vw;
  height: 100vh;
  background-color: #D9DDDE;
  position: fixed;
  top: 0;
  left: -200vw;
  padding: 15px;
  trasition: left .5s;
  z-index: 101;
  overflow: scroll;

  &.show {
    left: 0;
  }
}

.close-card {
  font-size: 1.5rem;
  padding: 5px;
  border-radius: 5px;
  right: 10px;
  border: 2px solid gray;
  color: gray;
  width: 15px;
  float: right;
  cursor: pointer;
}

.shoe-detail {
  display: flex;
  justify-content: center;
  flex-direction: column;

  p.description {
    padding: 3px;
  }

  .button-container{ 
    button {
      font-weight: bold;
      background-color: black;
      color: white;
      width: 150px;
      border: none;
      padding: 10px;
      border-radius: 5px;
      margin: 0 5px 0 5px;
      cursor: pointer;
    }
  }
}

@media screen and (max-width: 500px) {
  .card {
    width: 95%;
  }

  .regular-image {
    display: none;
  }

  .small-image {
    display: block;
  }
}

</style>