<template>
    <div>
<!--      <button @click="click()">点击</button>-->
      <ul id="ul">
        <li id="li0">0</li>
        <li id="li1">1</li>
        <li id="li2">2</li>
        <li id="li3">3</li>
      </ul>
    </div>
</template>

<script>
    export default {
        name: "closure",
        data(){
            return{

            }
        },
        created(){
            this.onSearch();
        },
        methods:{
            onSearch(){
                debugger
                this.$get
            },
            // click(){
            //     var result;
            //     for (var i = 0; i<10; i++){
            //         debugger
            //         result = (function (num) {
            //             debugger
            //             return function(){
            //                 debugger
            //                 console.info(num)
            //             };
            //
            //             // console.info(num)
            //
            //
            //         })(i);
            //     }
            //     return result;
            // },

            click(){
                debugger
                // for (var i = 0; i < 4; i++) {
                //     setTimeout(
                //         (function(i) {
                //             debugger
                //             return function() {
                //                 debugger
                //                 console.log(i);
                //             };
                //         })(i),
                //         300
                //     );
                // }
                var s;
                for (var i = 0; i < 4; i++) {
                    debugger
                    // setTimeout(
                        (function() {
                            debugger
                            var temp = i;
                            s = function() {
                                debugger
                                console.log(temp);
                            };
                        })()
                    //     300
                    // );
                }
                return s;
            }
        },
        mounted() {
            // var a = this.click();
            // debugger
            // a();
            // var a = this.click();
            // debugger
            // a();
            var op = document.querySelectorAll("li");
            debugger
            // for (var j = 0; j < op.length; j++) {
            //     op[j].onclick = function() {
            //         alert(j);
            //     };
            // }
            for (var j = 0; j < op.length; j++) {
                debugger
                op[j].onclick = (function(j) {
                    debugger
                    return function() {
                        debugger
                        alert(j);
                    };
                })(j);
            }


        }
    }
</script>

<style scoped>

</style>
