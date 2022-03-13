<template>
  <a-layout>
    <a-layout-content
      :style="{
        background: '#fff',
        padding: '24px',
        margin: 0,
        minHeight: '280px',
      }"
    >
      <div class="about">
        <h1>题库</h1>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import axios from "axios";

export default defineComponent({
  name: "QuestionPoolView",
});
</script>