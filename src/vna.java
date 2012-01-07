import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

final class vna {

   static int c;
   static int a;
   static int b;


   static final void a(int var0, byte[] var1, int var2, Object[] var3, int var4, int var5, Object[] var6, int var7, int var8, int var9) {
      try {
         ++b;
         if(var6[4] == var3 && var6[1] == vk.f) {
            if(0 == var7) {
               var7 = var8;
            }

            ByteBuffer var10 = (ByteBuffer)((Object[])((Object[])var6[0]))[57];
            var10.clear();
            var10.put(var1, var9, var2 * var7);
            IDirect3DTexture.Upload(((long[])((long[])var6[2]))[0], 0, var4, var5, var8, var2, ((int[])((int[])((Object[])((Object[])var6[4]))[0]))[0] * var7, 0, ((long[])((long[])((Object[])((Object[])var6[0]))[50]))[0]);
            if(var0 != 1) {
               a(-49, (Object[])((Object[])var3[0]));
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw vt.a(var11, "vna.C(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + var4 + ',' + var5 + ',' + (var6 != null?"{...}":"null") + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++c;
      return var0 != 57?true:((boolean[])((boolean[])var1[1]))[1];
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, int var3) {
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      if(var3 < 94) {
         return (Object[])((Object[])var2[8]);
      } else {
         ++a;
         var1[2] = ja.a(var1, (int)-67);
         var1[0] = var2;
         ((int[])((int[])var1[1]))[0] = var0;
         return var1;
      }
   }

}
