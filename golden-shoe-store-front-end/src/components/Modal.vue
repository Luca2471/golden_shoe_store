<template> 
    <div class="modal-mask">
      <div class="modal-wrapper">
        <div class="modal-container">

          <div class="modal-header">
            <slot name="header">
              {{selectedShoe.model}} added to basket
            </slot>
          </div>

          <div class="modal-footer">
            <slot name="footer">
              <router-link to="/Basket">
                <button class="modal-button">
                  Go to basket
                  <i class="fa fa-shopping-basket"  style="color:#2c3e50;font-size:24px; padding:2% 2% 0 1%; cursor: pointer;"></i>
                </button>
              </router-link >

               <button class="modal-button" @click="$emit('close-modal')">
                Continue Shopping
              </button>
            </slot>
          </div>
        </div>
      </div>
    </div>
</template>

  

<script>
export default {
  props: ['selectedShoe'],
  data() {
    return {
      data: {
          showModal: false
        }
    }
  }
}

</script>

<style>
.modal-mask {
  position: absolute;
  top: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  transition: 0.3s ease;
}

.modal-container {
  right: 300px;
  background-color: #D9DDDE;
  justify-content: center;
  height: 204px;
}

.modal-button {
  color: #2c3e50;
  width: 100px;
  height: 55px;
  padding: 10px;
}

.modal-wrapper {
  margin: auto;
  width: 204px;
  padding: 10px;
}
  </style>