<template>
  <div class="shoes">
    <h1>Hello</h1>
    <shoes-list>This is the shoes list!</shoes-list>
  </div>
</template>

<script>
import ShoesList from "../components/ShoesList.vue";

export default {
  name: "shoes",

  components: {
    "shoes-list": ShoesList,
  }
}
</script>