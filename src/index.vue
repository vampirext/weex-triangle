<!--index.vue-->
<template>
  <div>
    <text class="text">GLSurfaceView is working!</text>
    <glsurface class="gls" ref='glsurface'></glsurface>
    <wxc-button class="but" text="旋转" size=medium type=white
                @wxcButtonClicked="buttonClicked">
    </wxc-button>
  </div>
</template>
<style>
.text{
  font-size: 30px;
  color: blueviolet;
}
.gls {
  width:750px;
  height:1000px;
}
.but{
  position:relative;
  top:-100px;
}
</style>

<script>
/**
        当点击button按钮，执行buttonClicked()中的操作，即执行自定义组件glsurface的turn()方法。
        教程：http://weex.apache.org/cn/guide/extend-android.html
         */
  import { WxcButton} from 'weex-ui';
  module.exports = {
    components: { WxcButton},
    methods: {
      buttonClicked () {
        this.$refs.glsurface.turn();
      }
    }
  };
</script>