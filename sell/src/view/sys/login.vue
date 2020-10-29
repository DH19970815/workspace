<template>
  <div>
    <div id="header"></div>
    <div id="content">
      <div class="img2" :style="{backgroundImage: 'url(' + imgUrl + ')'}">
        <a-form :layout="formLayout">
          <a-form-item
            :label-col="formItemLayout.labelCol"
            :wrapper-col="formItemLayout.wrapperCol"
          >
            <a-radio-group default-value="horizontal" @change="handleFormLayoutChange">
              <a-radio-button value="horizontal">
                登录
              </a-radio-button>
              <a-radio-button value="vertical">
                注册
              </a-radio-button>
              <!--        <a-radio-button value="inline">-->
              <!--          Inline-->
              <!--        </a-radio-button>-->
            </a-radio-group>
          </a-form-item>
          <a-form-item
            label="用户名"
            :label-col="formItemLayout.labelCol"
            :wrapper-col="formItemLayout.wrapperCol"
          >
            <a-input placeholder="input placeholder" v-model="userName" style="width: 300px" />
          </a-form-item>
          <a-form-item
            label="密码"
            :label-col="formItemLayout.labelCol"
            :wrapper-col="formItemLayout.wrapperCol"
          >
            <a-input type="password" placeholder="input placeholder" v-model="password" style="width: 300px" />
          </a-form-item>
          <a-form-item :wrapper-col="buttonItemLayout.wrapperCol">
            <a-button type="primary" @click="submit">
              Submit
            </a-button>
          </a-form-item>
        </a-form>
      </div>
    </div>
  </div>
</template>


<script>
  import imgUrl from '@/assets/image/login.png'
    export default {
        name: "login",
        data() {
            return {
                formLayout: 'horizontal',
                imgUrl: imgUrl,
                userName: "",
                password: "",
            };
        },
        computed: {
            formItemLayout() {
                const { formLayout } = this;
                return formLayout === 'horizontal'
                    ? {
                        labelCol: { span: 19 },
                        wrapperCol: { span: 25 },
                    }
                    : {};
            },
            buttonItemLayout() {
                const { formLayout } = this;
                return formLayout === 'horizontal'
                    ? {
                        wrapperCol: { span: 20, offset: 10 },
                    }
                    : {};
            },
        },
        methods: {
            handleFormLayoutChange(e) {
                this.formLayout = e.target.value;
            },
            submit(e){
                let param = {
                    userName: this.userName,
                    password: this.$md5(this.password),
                }
                this.$post("/system/login", param).then(response => {
                    debugger
                })

            }
        },
        created() {
        }
    };
</script>

<style scoped>

</style>
