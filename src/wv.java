import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

final class wv {

   static int f;
   static int c;
   static int f_i;
   static int h;
   static Object[] d = ura.a(-70, new Object[2]);
   static Object[] e = sj.a(64, new Object[3], (byte)-55);
   static int a;
   static int b = 0;
   static Object[][] g;


   static final void a(byte var0) {
      ++a;
      if(jpa.a(ipa.d, -122)) {
         hna.a(-76, false);
      } else {
         lka.d = (Object[])((Object[])lba.f[8]);
         lba.f[8] = null;
         iea.a(14, (byte)-25);
         int var1 = -64 % ((var0 - 29) / 61);
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ((int[])((int[])var2[5]))[0] = de.a((int)0, var0);
      ++c;
      ((int[])((int[])var2[5]))[3] = lr.a(1, var0);
      ((int[])((int[])var2[5]))[2] = fh.a(var0, false);
      if(var1 >= -76) {
         e = (Object[])((Object[])e[2]);
      }

      ((int[])((int[])var2[5]))[1] = fh.a(var0, false);
   }

   static final Object[] a(byte[] var0, int var1, Object[] var2, int var3, Object[] var4, int var5, int var6, boolean var7, Object[] var8) {
      if(var8[9] == null) {
         var8[9] = new int[3];
      }

      int var9 = -126 % ((var6 - 15) / 40);
      ++f_i;
      qb.a(vk.f, var8, var2, false, var3 * var1 * var5, -31470, var4);
      ((int[])((int[])var8[9]))[0] = var3;
      ((int[])((int[])var8[9]))[1] = var5;
      ((int[])((int[])var8[9]))[2] = var1;
      ((long[])((long[])var8[2]))[0] = IDirect3DDevice.CreateVolumeTexture(((long[])((long[])((Object[])((Object[])var8[0]))[50]))[5], var1, var3, var5, 1, 0, wg.a((byte)10, var2, (Object[])((Object[])var8[1])), 1);
      ByteBuffer var10 = (ByteBuffer)((Object[])((Object[])var8[0]))[57];
      var10.clear();
      var10.put(var0);
      IDirect3DVolumeTexture.Upload(((long[])((long[])var8[2]))[0], 0, 0, 0, 0, ((int[])((int[])var8[9]))[2], ((int[])((int[])var8[9]))[0], ((int[])((int[])var8[9]))[1], ((int[])((int[])var8[9]))[2] * ((int[])((int[])var2[0]))[0], 0, ((long[])((long[])((Object[])((Object[])var8[0]))[50]))[0]);
      return var8;
   }

   static final float a(byte var0, float var1, Object[] var2) {
      if(var0 > -125) {
         e = (Object[])null;
      }

      ++h;
      if(var2 != null && -9 == ~var2.length) {
         return var1;
      } else if(null != var2 && -12 == ~var2.length) {
         return to.a(var1, var2, (byte)6);
      } else if(null != var2 && -16 == ~var2.length) {
         return bpa.a((byte)-58, var2, var1);
      } else if(null != var2 && (var2.length == 10 || var2.length == 15)) {
         return vka.a(15, var1, var2);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, Object[] var1) {
      ++f;
      uh.a(var1, 2);
      if(null != var1[1]) {
         a(10588, (Object[])((Object[])var1[1]));
      }

      if(var1[4] != null) {
         a(10588, (Object[])((Object[])var1[4]));
      }

      if(var0 != 10588) {
         b = -89;
      }

   }

}
