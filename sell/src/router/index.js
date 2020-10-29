import Vue from 'vue'
import Router from 'vue-router'
import login from '@/view/sys/login'
// import HelloWorld from '@/components/HelloWorld'
import father from '@/view/slot/father'
// import children from '@/view/slot/children'
// import closure from '@/view/closure/closure'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'default',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },
    // {
    //   path: '/children',
    //   name: 'children',
    //   component: children
    // }
  ]
})
