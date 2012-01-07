import jaggl.OpenGL;

final class hh {

   static int f;
   static int b;
   static Object[] a;
   static int e;
   static int c;
   static int d;


   static final void a(Object[] var0, byte var1, Object[] var2) {
      ++e;
      synchronized(var0[3]) {
         gt.a((Object[])((Object[])var0[3]), -124, (nj)(var2 == null?null:var2[0]));
         ++((int[])((int[])var0[1]))[0];
      }

      int var4 = 7 / ((31 - var1) / 57);
      if(null != var0[2]) {
         synchronized(var0[2]) {
            var0[2].notify();
         }
      }

   }

   static final void a(Object[] var0, int var1) {
      int var2 = 91 % ((-4 - var1) / 51);
      ++f;
      if(null == var0[8]) {
         var0[8] = new boolean[7];
      }

   }

   static final boolean b(Object[] var0, int var1) {
      ++d;
      if(var1 < 86) {
         return true;
      } else if(var0 != null && 6 == var0.length) {
         OpenGL.glBindFramebufferEXT('\u8d40', ((int[])((int[])var0[5]))[2]);

         for(int var3 = 0; var3 < 4; ++var3) {
            if((((int[])((int[])var0[5]))[1] & 1 << var3) != 0) {
               Object[] var4 = ((Object[][])((Object[][])var0[2]))[var3];
               if(null == var4) {
                  OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var3, '\u8d41', 0);
               } else {
                  qm.a(92, var4, var3 + '\u8ce0');
               }
            }
         }

         if(-1 != ~(16 & ((int[])((int[])var0[5]))[1])) {
            ada.a(3, var0);
         }

         ((int[])((int[])var0[5]))[1] = 0;
         if(null != var0 && var0.length == 36) {
            return true;
         } else {
            boolean var2 = ffa.a(-9088, var0);
            return var2;
         }
      } else {
         return var0 != null && var0.length == 7?bo.a(var0, 44):ffa.a(-9088, var0);
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, int var3, int var4, int var5, int var6, byte var7, int var8) {
      ++c;
      if(var2[0] == null) {
         var2[0] = new int[7];
      }

      gfa.a(var2, var3, var1, 0, var5);
      ((int[])((int[])var2[0]))[4] = var4;
      ((int[])((int[])var2[0]))[5] = var0;
      if(var7 < 15) {
         a(((int[])((int[])a[2]))[0], 101, (Object[])null, 113, ((int[])((int[])var2[0]))[0], 16, ((int[])((int[])var2[4]))[12], (byte)89, -52);
      }

      ((int[])((int[])var2[0]))[6] = var8;
      ((int[])((int[])var2[0]))[3] = var6;
      return var2;
   }

}
