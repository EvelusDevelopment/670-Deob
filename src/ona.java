import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

final class ona {

   static int e;
   static int b;
   static short[] a = new short[256];
   static int c;
   static int g;
   static int h;
   static int f;
   static Object[] d;


   static final Object[] a(int var0, Object[] var1, int var2, int[] var3, int var4, int var5, Object[] var6, boolean var7, int var8) {
      ++b;
      dka.a(2, var6);
      qb.a(vk.f, var6, ah.f, var7 && ((boolean[])((boolean[])var1[63]))[23], var5 * var2, -31470, var1);
      if(!((boolean[])((boolean[])((Object[])((Object[])var6[0]))[63]))[24]) {
         ((int[])((int[])var6[9]))[1] = fda.a(var2, (byte)81);
         ((int[])((int[])var6[9]))[0] = fda.a(var5, (byte)81);
      } else {
         ((int[])((int[])var6[9]))[1] = var2;
         ((int[])((int[])var6[9]))[0] = var5;
      }

      if(var7) {
         ((long[])((long[])var6[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var6[0]))[50]))[5], ((int[])((int[])var6[9]))[1], ((int[])((int[])var6[9]))[0], 0, 1024, 21, 1);
      } else {
         ((long[])((long[])var6[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var6[0]))[50]))[5], ((int[])((int[])var6[9]))[1], ((int[])((int[])var6[9]))[0], 1, 0, 21, 1);
      }

      if(var8 == 0) {
         var8 = var2;
      }

      ByteBuffer var9 = (ByteBuffer)((Object[])((Object[])var6[0]))[57];
      var9.clear();
      var9.asIntBuffer().put(var3, var4, var5 * var8);
      IDirect3DTexture.Upload(((long[])((long[])var6[2]))[0], 0, 0, 0, var2, var5, var8 * ((int[])((int[])((Object[])((Object[])var6[var0]))[0]))[0], 0, ((long[])((long[])((Object[])((Object[])var6[0]))[50]))[0]);
      return var6;
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      if(var0 < 110) {
         a((Object[])((Object[])var1[3]), (Object[])null, ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[4]))[0]))[16]))[2]);
      }

      ++e;
      Object[] var3 = qca.a(0);
      var3[3] = var2;
      ((int[])((int[])var3[1]))[1] = ((int[])((int[])var2[0]))[1];
      if(-1 == ((int[])((int[])var3[1]))[1]) {
         var3[0] = cpa.a(new Object[4], -127, 260);
      } else if(((int[])((int[])var3[1]))[1] == -2) {
         var3[0] = cpa.a(new Object[4], -125, 10000);
      } else if(((int[])((int[])var3[1]))[1] <= 18) {
         var3[0] = cpa.a(new Object[4], -122, 20);
      } else if(((int[])((int[])var3[1]))[1] <= 98) {
         var3[0] = cpa.a(new Object[4], -128, 100);
      } else {
         var3[0] = cpa.a(new Object[4], -124, 260);
      }

      pa.a(3, var1, (Object[])((Object[])var3[0]));
      mp.a(-13822, ((int[])((int[])((Object[])((Object[])var3[3]))[0]))[0], (Object[])((Object[])var3[0]));
      ((int[])((int[])var3[1]))[0] = 0;
      return var3;
   }

   static final void a(float var0, Object[] var1, float var2, float var3, Object[] var4, boolean var5) {
      ++c;
      if(!var5) {
         a((byte)90, (Object[])null, (Object[])null);
      }

      if(null != var4 && -17 == ~var4.length) {
         lba.a(var4, var3, var2, var1, var0, var5);
      } else if(null != var4 && var4.length == 12) {
         nh.a(var1, 2159, var4, var0, var3, var2);
      } else {
         throw new IllegalStateException();
      }
   }

   static final boolean a(Object[] var0, Object[] var1, int var2) {
      ++h;
      if(var1 != var0[7]) {
         if(!ui.f(var1, var2 + 15304)) {
            return false;
         } else {
            var0[7] = var1;
            if(var2 != -15413) {
               a(-0.81105655F, (Object[])null, ((float[])((float[])var0[3]))[11], -1.0231639F, (Object[])((Object[])var1[16]), true);
            }

            ((int[])((int[])var0[1]))[2] = Class_cs.a(var0, 3, var1);
            if(0 == ~((int[])((int[])var0[1]))[2]) {
               throw new IllegalArgumentException();
            } else {
               if(((boolean[])((boolean[])var0[6]))[0]) {
                  dra.a((Object[])((Object[])var0[8]), false, ((long[])((long[])((Object[])((Object[])var0[7]))[6]))[0]);
                  mm.a((Object[])((Object[])var0[8]), ((long[])((long[])((Object[])((Object[])var0[7]))[6]))[1], (byte)96);
                  ((Object[])((Object[])var0[8]))[82] = var0[7];
               }

               return true;
            }
         }
      } else {
         return true;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++f;
      int var2 = -102 % ((var1 - 0) / 34);
      int var3 = 0;

      while(~var3 > ~((int[])((int[])var0[1]))[1]) {
         if(var0 != null && 18 == var0.length) {
            qt.a(0, (Object[])null);
         }

         lm var4 = ((lm[])((lm[])var0[4]))[var3];

         while(true) {
            lm var5 = var4.f;
            if(var4 == var5) {
               ++var3;
               break;
            }

            var5.a((byte)80);
         }
      }

      var0[2] = null;
      var0[0] = null;
      if(var0 != null && -26 == ~var0.length && var0[0].equals(Boolean.valueOf(false))) {
         a((Object[])null, 68);
      }

   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      tua.a(var0, (int)14);
      ++g;
      bpa var4 = new bpa(var0);
      var0[1] = var4;
      if(var2 != 125) {
         a = (short[])null;
      }

      sea.a(var1, var0, (byte)103);
      return var0;
   }

}
