import { createStore } from 'vuex'

function updateLocalStorage(basket) {
  localStorage.setItem('basket', JSON.stringify(basket))
}

export default createStore({
  state: {
    basket: [],
  },

  getters: {
    itemQuantity: state => shoe => {
      const item = state.basket.find(i => i.id === shoe.id);
      if (item) {
        return item.amount;
      } else {
        return null;
      }
    },
    
    basketItems: state => {
      return state.basket;
    },

    totalInBasket: state => {
      return state.basket.reduce((a, b) => a + (b.price * b.amount), 0);
    }
  },

  mutations: {
    addToBasket(state, shoe) {
      let item = state.basket.find(i => i.id === shoe.id);
      if (item) {
        if (item.quantity > item.amount) {
          item.amount++;
          window.alert("Item added to basket");
        } else {
          window.alert("Not enought items in stock");
        }
      } else {
        state.basket.push({...shoe, amount: 1});
        window.alert("Item added to basket");
        }
      updateLocalStorage(state.basket);
    },

    clearBasket(state) {
      state.basket = [];
      updateLocalStorage(state.basket);
    },

    removeFromBasket(state, shoe) {
      let item = state.basket.find(i => i.id === shoe.id);
      if (item) {
        if (item.amount > 1) {
          item.amount--;
        } else {
          state.basket = state.basket.filter(i => i.id !== shoe.id);
        }
      }
      updateLocalStorage(state.basket);
    },

    updateBasketFromLocalStorage(state) {
      const basket = localStorage.getItem('basket');
      if (basket) {
        state.basket = JSON.parse(basket);
      }
    }
  },

  actions: {
  },

  modules: {
  }
})
