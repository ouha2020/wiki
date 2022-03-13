<template>
  <a-layout-header class="header">
    <div class="logo">东京IT全栈之家</div>
    <a-menu
      v-model:selectedKeys="selectedKeys1"
      theme="dark"
      mode="horizontal"
      :style="{ lineHeight: '64px' }"
    >
      <a-menu-item key="/">
        <router-link to="/">首页</router-link>
      </a-menu-item>
      <a-menu-item key="book">
        <router-link to="/admin/book">教程</router-link>
      </a-menu-item>
      <a-menu-item key="/questionPool">
        <router-link to="/questionPool">题库</router-link>
      </a-menu-item>
      <a-menu-item key="/course">
        <router-link to="/course">编程课程</router-link>
      </a-menu-item>
      <a-menu-item key="onlineTools">
        <router-link to="/onlineTools">在线工具</router-link>
      </a-menu-item>
      <a-menu-item key="category">
        <router-link to="/admin/category">分类管理</router-link>
      </a-menu-item>
      <a-menu-item key="user">
        <router-link to="/admin/user">用户管理</router-link>
      </a-menu-item>
      <a-menu-item key="about">
        <router-link to="/about">关于</router-link>
      </a-menu-item>
      <a class="login-menu" v-show="user.id">
        <span>您好：{{ user.name }}</span>
      </a>
    </a-menu>

    <a-modal
      title="登录"
      v-model:visible="loginModalVisible"
      :confirm-loading="loginModalLoading"
      @ok="login"
    >
      <a-form
        :model="loginUser"
        :label-col="{ span: 6 }"
        :wrapper-col="{ span: 18 }"
      >
        <a-form-item label="登录名">
          <a-input v-model:value="loginUser.loginName" />
        </a-form-item>
        <a-form-item label="密码">
          <a-input v-model:value="loginUser.password" type="password" />
        </a-form-item>
      </a-form>
    </a-modal>
  </a-layout-header>
</template>

<script lang="ts">
import { defineComponent, ref, computed } from "vue";
import axios from "axios";
import { message } from "ant-design-vue";
import store from "@/store";
export default defineComponent({
  name: "App-Header",
  setup() {
    // 登录后保存
    const user = "as";

    // 用来登录
    const loginUser = ref({
      loginName: "test",
      password: "test",
    });
    const loginModalVisible = ref(false);
    const loginModalLoading = ref(false);
    const showLoginModal = () => {
      loginModalVisible.value = true;
    };

    // 登录
    const login = () => {
      // console.log("开始登录");
      // loginModalLoading.value = true;
      // loginUser.value.password = hexMd5(loginUser.value.password + KEY);
      // axios.post("/user/login", loginUser.value).then((response) => {
      //   loginModalLoading.value = false;
      //   const data = response.data;
      //   if (data.success) {
      //     loginModalVisible.value = false;
      //     message.success("登录成功！");

      //     store.commit("setUser", data.content);
      //   } else {
      //     message.error(data.message);
      //   }
      // });
    };

    // 退出登录
    const logout = () => {
      console.log("退出登录开始");
      // axios.get("/user/logout/" + user.value.token).then((response) => {
      //   const data = response.data;
      //   if (data.success) {
      //     message.success("退出登录成功！");
      //     store.commit("setUser", {});
      //   } else {
      //     message.error(data.message);
      //   }
      // });
    };

    return {
      loginModalVisible,
      loginModalLoading,
      showLoginModal,
      loginUser,
      login,
      user,
      logout,
    };
  },
});
</script>

<style>
.login-menu {
  float: right;
  color: white;
  padding-left: 10px;
}

.logo {
  width: 150px;
  height: 30px;
  /*background: rgba(255, 255, 255, 0.2);*/
  /*margin: 16px 28px 16px 0;*/
  float: left;
  color: white;
  font-size: 18px;
}
</style>