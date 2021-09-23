<template>
  <div class="shopping-basket">
    <shopping-basket></shopping-basket>
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
    "shopping-basket": ShoppingBasket
  }
}

</script>
