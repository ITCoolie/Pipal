<template>
  <Pipal from="customerservice" fromName="lily"
  to="user1" toName="lily" toIcon="./assets/lily.png"/>
</template>

<script>
import Pipal from './components/Pipal.vue'

export default {
  name: 'App',
  components: {
    Pipal
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
