import jaggl.OpenGL;

final class rw extends tha {

   Object[] y;
   static int z;
   static Object[] x = sj.a(8, new Object[3], (byte)-109);
   static int t;
   static int u;
   static int[] w;
   static int A = -1;
   static Object[] v = st.a(new Object[1], 7, 1, 8);


   rw(Object[] var1) {
      this.y = var1;
   }

   static final Object[] a(Object[] var0, byte var1, byte[] var2, int var3, Object[] var4, Object[] var5, int var6, Object[] var7, int var8, Object[] var9) {
      ++u;
      if(null != var5 && 4 == var5.length && var5[1].equals(Integer.valueOf(2))) {
         return null;
      } else {
         if(var7[1] == null) {
            var7[1] = new int[6];
         }

         np.a(var1 - 49, var9, var0, '\u806f', var7, var5, false, var3 * var6 * var8);
         ((int[])((int[])var7[1]))[3] = var6;
         ((int[])((int[])var7[1]))[5] = var8;
         ((int[])((int[])var7[1]))[4] = var3;
         moa.a((byte)102, var7, (Object[])((Object[])var7[4]));
         if(var1 != 50) {
            A = ((int[])((int[])((Object[])((Object[])var4[2]))[0]))[3];
         }

         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(((int[])((int[])var7[1]))[2], 0, bu.a(115, (Object[])((Object[])var7[5]), (Object[])((Object[])var7[2])), ((int[])((int[])var7[1]))[3], ((int[])((int[])var7[1]))[4], ((int[])((int[])var7[1]))[5], 0, rha.b(var1 - 42, var4), 5121, var2, 0);
         OpenGL.glPixelStorei(3317, 4);
         gg.a((byte)-101, var7, true);
         return var7;
      }
   }

   static final void b(int var0) {
      iea.a(13, (byte)-106);
      ++z;
      if(var0 < -26) {
         te.a(false, (byte)79);
         if(0 <= rga.d && 0 != rga.d) {
            lg.a(false, rga.d, (byte)-41);
            rga.d = -1;
         }

         System.gc();
      }
   }

}
