package github.chenupt.recyclerviewdemo.recyclerhelper;

import android.content.Context;

/**
 * Created by chenupt@gmail.com on 14/10/28.
 * Description : 适用AndroidAnnotations框架，使用build方法实例化view
 */
public class AAModelFactory extends ModelFactory{

    public static final String TAG = "AAModelFactory";

    protected AAModelFactory(Builder builder) {
        super(builder);
    }

    @Override
    protected BaseItemModel newInstance(Context context, Class<?> owner) throws Exception {
        return (BaseItemModel) owner.getMethod("build", new Class[]{Context.class}).invoke(owner, context);
    }
}
