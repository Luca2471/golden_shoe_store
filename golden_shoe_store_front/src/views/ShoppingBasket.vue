<template>
  <div>
  <h1>This is the shopping basket</h1>
    <ShoppingBasket></ShoppingBasket>
  </div>
</template>

<script>
import ShoppingBasket from "../components/ShoppingBasket.vue";

export default {
  name: "shopping-basket",
  data() {
    return {

    }
  },
  components: {
    ShoppingBasket
  }
}

</script>
