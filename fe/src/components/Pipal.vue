<template>
  <div class="area">
    <ul>
        <li>to:</li><li>{{ toName }}</li><li>
          <img src="{{ toIcon }}">
        </li> 
    </ul>
    <ul>
      <li><textarea></textarea></li>
    </ul>
    <ul>
        <li><input /></li>
        <li><button>send</button></li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    from: String,
    fromName: String,
    to: String,
    toName: String,
    toIcon: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h4 {
  margin: 5px;
  text-align:left
}
ul {
  list-style-type: none;
  padding: 0;
  border:1px;
  text-align:left;
}
li {
  display: inline-block;
  margin: 0 10px;
  text-align:right;
}
a {
  color: #42b983;
}
textarea{
  width: 400px;
  height: 200px;
  background-color:#EEE;
  display: inline-block;
  margin: 1px 1px;
  background-color:#EEE;
}
button{
  text-align:right;
}
</style>
