<template>
  <div>
    <children>
      <template slot="a" slot-scope="f">ad  {{f}}}</template>
      hello

    </children>

  </div>
</template>

<script>
  import children from './children'
    export default {
        name: "father",
        data(){
            return{

            }
        },
        components: {
            children
        }
    }
</script>

<style scoped>

</style>
