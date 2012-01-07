package jagdx;


public class D3DLIGHT {

   public static final native void SetSpotParams(long var0, float var2, float var3, float var4);

   public static final native void SetAmbient(long var0, float var2, float var3, float var4, float var5);

   public static final native long Create();

   public static final native void SetRange(long var0, float var2);

   public static final native void Destroy(long var0);

   public static final native void SetDirection(long var0, float var2, float var3, float var4);

   public static final native void SetType(long var0, int var2);

   public static final native void SetDiffuse(long var0, float var2, float var3, float var4, float var5);

   public static final native void SetAttenuation(long var0, float var2, float var3, float var4);

   private D3DLIGHT() throws Throwable {
      throw new Error();
   }

   public static final native void SetSpecular(long var0, float var2, float var3, float var4, float var5);

   public static final native void SetPosition(long var0, float var2, float var3, float var4);
}
