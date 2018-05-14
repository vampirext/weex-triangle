package com.weex.app.extend;
//下面的import无论什么组件都要有
import android.content.Context;
import android.support.annotation.NonNull;
//下面的import根据原生natvie组件的不同而不同，一般根据Android studio中界面activity中的import引用
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

//下面的import无论什么组件都要有
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXDomObject;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.annotation.JSMethod;


public class glsurface extends WXComponent<MyGLSurfaceView> {
//以下语句块无论什么组件都要有
  public glsurface(WXSDKInstance instance, WXDomObject dom, WXVContainer parent) {
    super(instance, dom, parent);
  }
  public MyGLSurfaceView view;//由于自定义组件方法turn()也要用到MyGLSurfaceView的对象,所以将对象view作为类的参数定义到initComponentHostView外
  @Override
  protected MyGLSurfaceView initComponentHostView(@NonNull Context context) {
    view = new MyGLSurfaceView(context);
    return view;
  }
  /**
  在组件中如下声明一个组件方法,需在上方import com.taobao.weex.annotation.JSMethod;
   */
  @JSMethod
  public void turn(){
  view.move();
  } 
 
}
