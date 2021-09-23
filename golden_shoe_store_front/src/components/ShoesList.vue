<template>
  <div>
    <header v-if="selectedStyle !== null">{{ selectedStyle.category  }}</header>

    <ul v-if="selectedStyle !== null">
      <li @click="addShoeToBasket(shoe)" v-for="(shoe, index) in sortShoes" :key="index">
        <a @click="applyDiscount()">{{shoe.model}}</a>
        <a v-if="selectedCategory !== 'Offers'">{{shoe.price}}</a>
        <br>
        <a v-if="shoe.quantity == 1">Only 1 left in stock!</a>
        <a v-if="shoe.quantity == 0">This item is out of stock!</a>
      </li>
    </ul>
  </div>
</template>

<script>
import { eventBus } from "../main.js";
import GoldenShoeService from "../services/GoldenShoeService.js";

export default {
  name: "shoes-list",
  data() {
    return{
      selectedCategory: null,
      selectedStyle: null,
      shoesInOffer: [],
      discountAmount: 0.9,
      discountedPrice: [],
    }
  },

  methods: {
    addShoeToBasket(shoe) {
      if (shoe.quantity > 0) {
        eventBus.$emit('add-shoe-to-basket', shoe)
      }
    },

    applyDiscount() {
      do {
        for (let item of this.shoesInOffer) {
          const discountedShoe = {
            color: item.color,
            gender: item.gender,
            id: item.id,
            model: item.model,
            quantity: item.quantity,
            shoeType: item.shoeType,
            shoeURL: item.shoeURL,
            price: (item.price * 0.9)
          }
          this.discountedPrice.push(discountedShoe)
        }
      }  while (this.shoesInOffer.lenght > this.discountedPrice.lenght)
    },

    fetchShoes() {
      GoldenShoeService.getModels()
      .then(res => this.shoesInOffer = res);
      this.applyDiscount();
    }
  },

  computed: {
    sortShoes: function() {
      let shoes = [];
      if (this.selectedStyle !== (null || "Offers")) {
        for (let shoe of this.selectedStyle.shoeModels) {
          if (shoe.gender === this.selectedCategory.name)  {
            shoes.push(shoe);
          } else if (this.selectedCategory.name === "Styles") {
            shoes.push(shoe);
          } 
        }
      } else if (this.selectedCategory.name === "Offers") {
        this.fetchShoes();
        shoes = this.shoesInOffer;
      }
      return shoes;
    },
  },

  mounted() {
    eventBus.$on('selected-category', (category) => { 
      console.log(category.name)
      this.selectedCategory = category
      if (this.selectedCategory.name === "Offers") {
        this.selectedStyle = "Offers"
        this.selectedCategory = category
      } else {
        this.selectedCategory = category
      }
    });
    eventBus.$on('selected-style', (selectedStyle) => this.selectedStyle = selectedStyle);
  }
}
</script>

<style lang="scss" scoped>
</style>