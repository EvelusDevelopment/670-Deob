import jagdx.D3DDISPLAYMODE;
import jagdx.IDirect3D;
import jagdx.fna;

final class bq {

   static int e;
   static Object[] b;
   static int c;
   Object[] f;
   static int d;
   static int g;
   static int h;
   static int a;


   static final boolean a(boolean var0, Object[] var1, Object[] var2, Object[] var3) {
      ++h;
      if(var0) {
         a((Object[])null, (Object[])null, 0);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return fna.a(IDirect3D.GetAdapterDisplayMode(((long[])((long[])var1[50]))[6], ((int[])((int[])var1[1]))[41], var4), (byte)-6) && fna.a(IDirect3D.CheckDeviceFormat(((long[])((long[])var1[50]))[6], ((int[])((int[])var1[1]))[41], ((int[])((int[])var1[1]))[39], var4.Format, 0, 3, wg.a((byte)69, var3, var2)), (byte)-106);
   }

   protected final void finalize() throws Throwable {
      iaa.a(this.f, -1);
      ++a;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      if(!((boolean[])((boolean[])var0[2]))[0]) {
         if(null != var1 && ((boolean[])((boolean[])var1[2]))[0]) {
            ((int[])((int[])var0[1]))[1] = -((int[])((int[])var1[1]))[5] + 255;
         } else {
            ((int[])((int[])var0[1]))[1] = 0;
         }
      } else {
         ((int[])((int[])var0[1]))[1] = ((int[])((int[])var0[1]))[5];
      }

      ++g;
      var0[0] = var1;
      ((int[])((int[])var0[1]))[5] = 0;
      if(var2 > -39) {
         a((Object[])null, (Object[])((Object[])var0[2]), 91);
      }

      ((boolean[])((boolean[])var0[2]))[0] = true;
   }

   final void a(int var1) throws Throwable {
      super.finalize();
      ++c;
      int var2 = -76 % ((var1 - 11) / 47);
   }

   bq(Object[] var1) {
      this.f = var1;
   }

   static final void a(int var0, Object[] var1) {
      ++d;
      if(((int[])((int[])var1[1]))[23] != 8) {
         iba.a((int)5556, var1);
         oh.a(true, var1, (byte)-40);
         am.a(true, (byte)117, var1);
         kh.a(true, (byte)-126, var1);
         aqa.a(1, var1, 69);
         ((int[])((int[])var1[1]))[23] = 8;
      }

      if(var0 != 12391) {
         a((Object[])null, (Object[])null, ((int[])((int[])((Object[])((Object[])b[30]))[24]))[0]);
      }

   }

}
