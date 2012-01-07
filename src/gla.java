import jagdx.IDirect3DTexture;
import java.io.IOException;
import java.nio.ByteBuffer;

final class gla {

   static int f;
   static int e;
   static int c;
   static int d;
   static Object[] a = sd.a(new Object[1], 51, (byte)114);
   static int b;


   static final void a(boolean var0, Object[] var1) {
      ++d;
      if(var1 != null && var1.length == 8) {
         ek.a(1, var1);
      } else if(null != var1 && var1.length == 9) {
         ek.a(1, var1);
      } else {
         if(var0) {
            a = (Object[])((Object[])a[8]);
         }

         ek.a(1, var1);
      }
   }

   static final void a(Object[] var0, byte var1, Object[] var2, int var3) {
      if(var1 != 114) {
         a = (Object[])((Object[])a[0]);
      }

      if(!((boolean[])((boolean[])var2[5]))[0]) {
         moa.a((byte)126, var0, (Object[])((Object[])var2[0]));
         za.a(var3, -20929, (Object[])((Object[])var2[0]));
      }

      ++f;
   }

   static final void a(byte var0, long var1, Object[] var3) throws IOException {
      int var4 = -122 % ((var0 + 53) / 44);
      ++b;
      if(var1 >= 0L) {
         ((long[])((long[])var3[4]))[4] = var1;
      } else {
         throw new IOException();
      }
   }

   static final void a(boolean var0, Object[] var1, boolean var2) {
      ++c;
      if(!var2) {
         a(false, (Object[])null, true);
      }

   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int[] var5, Object[] var6, int var7, int var8) {
      try {
         ++e;
         if(ah.f == var6[4] && vk.f == var6[1]) {
            if(0 == var1) {
               var1 = var2;
            }

            ByteBuffer var9 = (ByteBuffer)((Object[])((Object[])var6[0]))[57];
            var9.clear();
            var9.asIntBuffer().put(var5, var4, var8 * var1);
            IDirect3DTexture.Upload(((long[])((long[])var6[2]))[var0], 0, var7, var3, var2, var8, var1 * ((int[])((int[])((Object[])((Object[])var6[4]))[0]))[0], 0, ((long[])((long[])((Object[])((Object[])var6[0]))[50]))[0]);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var10) {
         throw vt.a(var10, "gla.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null?"{...}":"null") + ',' + (var6 != null?"{...}":"null") + ',' + var7 + ',' + var8 + ')');
      }
   }

}
