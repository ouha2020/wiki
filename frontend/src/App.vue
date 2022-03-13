<template>
  <a-layout>
    <App-Header/>
      <router-view/>
    <App-Footer/>
  </a-layout>
</template>
<script lang="ts">
import { defineComponent } from 'vue';
import AppHeader from '@/components/App-Header.vue';
import AppFooter from '@/components/App-Footer.vue';

export default defineComponent({
  name: 'app',
  components: {
    AppHeader,
    AppFooter
  }
});
</script>
