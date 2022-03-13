import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import QuestionPoolView from '../views/QuestionPoolView.vue'
import CourseView from '../views/CourseView.vue'
import OnlineToolsView from '../views/OnlineToolsView.vue'
import BookView from '../views/admin/BookView.vue'
import CategoryView from '../views/admin/CategoryView.vue'
import UserView from '../views/admin/UserView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/questionPool',
    name: 'questionPool',
    component: QuestionPoolView
  },
  {
    path: '/course',
    name: 'course',
    component: CourseView
  },
  {
    path: '/onlineTools',
    name: 'onlineTools',
    component: OnlineToolsView
  },
  {
    path: '/admin/book',
    name: 'book',
    component: BookView
  },  
  {
    path: '/admin/category',
    name: 'category',
    component: CategoryView
  },
  {
    path: '/admin/user',
    name: 'user',
    component: UserView
  },
  {
    path: '/',
    name: 'about',
    component: AboutView
  }
  
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
