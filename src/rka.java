import jaggl.OpenGL;

final class rka {

   static int f;
   static Object[] g = ed.a(0, new Object[1], (byte)-99, 96);
   static int h;
   static int b;
   static int[] a = new int[]{104, 120, 136, 168};
   static boolean[][][] e;
   static Object[] d;
   static Object[] c;


   static final void a(int var0, Object[] var1, Object[] var2) {
      var1[78] = var2;
      if(var0 != -24805) {
         a(((int[])((int[])var2[0]))[5], (Object[])null, (Object[])null);
      }

      ++h;
      Object[] var3 = (Object[])((Object[])var1[78]);
      if(((boolean[])((boolean[])((Object[])((Object[])var3[3]))[63]))[24]) {
         OpenGL.glBindBufferARB(((int[])((int[])var3[1]))[0], ((int[])((int[])var3[1]))[3]);
      }

   }

   static final void a(byte var0, int var1, Object[] var2, int var3) {
      ++b;
      if(var2 != null && var2.length == 87) {
         eaa.a(var2, true, var1, var3);
      } else if(var0 == -84) {
         if(var2 != null && var2.length == 91) {
            int var4 = 0;
            if((var3 & 1) != 0) {
               var4 = 16384;
               OpenGL.glClearColor((float)(var1 & 16711680) / 1.671168E7F, (float)(var1 & '\uff00') / 65280.0F, (float)(var1 & 255) / 255.0F, (float)(var1 >>> 24) / 255.0F);
            }

            if(0 != (var3 & 2)) {
               var4 |= 256;
               kh.a(true, (byte)73, var2);
            }

            if((4 & var3) != 0) {
               var4 |= 1024;
            }

            OpenGL.glClear(var4);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(String var0, Object[] var1, byte var2) {
      if(var2 >= -117) {
         return (Object[])null;
      } else {
         ++f;
         return qca.a(var0, 108, (Object[])((Object[])var1[4]));
      }
   }

}
