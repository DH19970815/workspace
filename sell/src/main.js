// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import Antd from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'
import  md5 from 'js-md5'
import {post, get, patch, put, remove} from './controller/common/http'

Vue.prototype.$post=post;
Vue.prototype.$fetch=get;
Vue.prototype.$patch=patch;
Vue.prototype.$put=put;
Vue.prototype.$remove=remove;
Vue.config.productionTip = false
Vue.use(Antd)
Vue.prototype.$md5 = md5;


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
