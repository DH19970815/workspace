<template>
    <div>
      {{this.msg}}
      <slot name="a" say="as"></slot>
    </div>
</template>

<script>
    export default {
        name: "children",
        data(){
            return{
                msg: '你好'

            }
        },
        mounted: {
            onSeaech(){
                this.$get("a","a")
            }
        }
    }
</script>

<style scoped>

</style>
