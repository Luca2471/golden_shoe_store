<template>
  <nav>
    <ul>
      <li v-for="(info, index) in infos" :key="index" style="display:inline; padding-right: 20px" >
        <a style="cursor: pointer;">{{info.name}}</a>
      </li>
    </ul>
  </nav>
</template>

<script>
export default {
  name: 'info-bar',
  data() {
    return {
      infos: [
        {
          name: "Contact Us", 
          URL: "Contact@email.com"
        },
        {
          name: "Delivery & Returns",
          URL: "DeliverAndReturns.com"
        },
        {
          name: "FAQ", 
          URL: "FAQ.co.uk"
        },
        {
          name: "Privacy Policy", 
          URL: "PrivacyPolicy.co.uk"
        }
      ],
    }
  }
}
</script>

<style lang="scss" scoped>

nav {
  text-align: center;
  background-color: #D9DDDE; 
  margin:0; 
  overflow: hidden;
}

</style>