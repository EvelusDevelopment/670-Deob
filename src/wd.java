import jaggl.OpenGL;

final class wd {

   static int e;
   static int d;
   static int f;
   static int b;
   static aa[] a;
   static int c;


   static final void a(byte var0, Object[] var1) {
      ++c;
      if(var0 != 99) {
         a = (aa[])null;
      }

      if(hqa.a((Object[])((Object[])((Object[])((Object[])var1[0]))[5]), var0 - 195) && !maa.a(bg.a(true, (Object[])((Object[])((Object[])((Object[])var1[0]))[5])), 76)) {
         ((int[])((int[])var1[1]))[0] = 0;
      }

      if(0 > ((int[])((int[])var1[1]))[0] || ((int[])((int[])var1[1]))[0] > 2) {
         ((int[])((int[])var1[1]))[0] = bd.a((byte)-127, var1);
      }

   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2, int var3) {
      lra.a(var1, 16830, var3, var2);
      ++b;
      return !var0?(Object[])null:var1;
   }

   static final void a(boolean var0, Object[] var1) {
      ++f;
      if(var1 != null && -88 == ~var1.length) {
         sn.a(var1, (byte)-92);
      } else if(var0) {
         if(var1 != null && var1.length == 91) {
            OpenGL.glTexEnvi(8960, '\u8571', hj.a((byte)-57, ((Object[][])((Object[][])var1[56]))[((int[])((int[])var1[1]))[7]]));
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final int[][] a(Object[] var0, int var1, boolean var2) {
      ++d;
      if(var0 != null && var0.length == 11) {
         int[][] var4 = loa.a((byte)-52, var1, (Object[])((Object[])var0[4]));
         if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0] && hka.a(var0, (int)103)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = ((int[])((int[])var0[1]))[3] * (var1 % ((int[])((int[])var0[1]))[3]);

            for(int var9 = 0; var9 < fo.b; ++var9) {
               int var10 = ((int[])((int[])var0[7]))[var8 + var9 % ((int[])((int[])var0[1]))[2]];
               var7[var9] = (var10 & 255) << 4;
               var6[var9] = var10 >> 4 & 4080;
               var5[var9] = (var10 & 16711680) >> 12;
            }

            if(null != var0 && 3 == var0.length) {
               il.a((byte)112, (Object[])null);
            }
         }

         return var4;
      } else {
         if(!var2) {
            a = (aa[])null;
         }

         return vi.a(var1, var0, !var2);
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 7) {
         ((boolean[])((boolean[])var0[0]))[0] = true;
         ++e;
      }
   }

}
