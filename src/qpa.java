import jaggl.OpenGL;

final class qpa {

   static int d;
   static Object[] c = sd.a(new Object[1], 70, (byte)112);
   static int a;
   static int e = 0;
   static int f;
   static int b;


   static final void a(int var0, int var1) {
      Object[] var2 = ju.g[0][var0][var1];

      for(int var3 = 0; var3 < 3; ++var3) {
         Object[] var4 = ju.g[var3][var0][var1] = ju.g[var3 + 1][var0][var1];
         if(var4 != null) {
            for(Object[] var5 = (Object[])((Object[])var4[3]); var5 != null; var5 = (Object[])((Object[])var5[0])) {
               Object[] var6 = (Object[])((Object[])var5[1]);
               if(((short[])((short[])var6[13]))[1] == var0 && ((short[])((short[])var6[13]))[3] == var1) {
                  --((byte[])((byte[])var6[10]))[0];
               }
            }

            if(var4[6] != null) {
               --((byte[])((byte[])((Object[])((Object[])var4[6]))[10]))[0];
            }

            if(var4[4] != null) {
               --((byte[])((byte[])((Object[])((Object[])var4[4]))[10]))[0];
            }

            if(var4[2] != null) {
               --((byte[])((byte[])((Object[])((Object[])var4[2]))[10]))[0];
            }

            if(var4[8] != null) {
               --((byte[])((byte[])((Object[])((Object[])var4[8]))[10]))[0];
            }

            if(var4[0] != null) {
               --((byte[])((byte[])((Object[])((Object[])var4[0]))[10]))[0];
            }
         }
      }

      if(ju.g[0][var0][var1] == null) {
         ju.g[0][var0][var1] = jg.a(-74, 0, new Object[10]);
         ((byte[])((byte[])ju.g[0][var0][var1][5]))[0] = 1;
      }

      ju.g[0][var0][var1][9] = var2;
      ju.g[3][var0][var1] = null;
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 3314) {
         a(false, 60, (Object[])null, false, -107, (int[])null, (Object[])null, 94, ((int[])((int[])((Object[])((Object[])var0[0]))[7]))[30], ((int[])((int[])c[26]))[1], -118);
      }

      ++b;
      return false;
   }

   static final void a(int var0) {}

   static final void b(Object[] var0, int var1) {
      de.a(((int[])((int[])var0[0]))[1], var1 + 19360, jca.n, ((int[])((int[])var0[0]))[4], Class_ds.a(jca.n, ((int[])((int[])var0[0]))[1], ((int[])((int[])var0[0]))[4], (byte)122), ((int[])((int[])var0[0]))[3], (String)var0[1], ((int[])((int[])var0[0]))[2]);
      ++d;
      if(var1 != -9683) {
         a((Object[])((Object[])var0[0]), ((byte[])((byte[])c[3]))[0]);
      }

   }

   static final Object[] a(boolean var0, int var1, Object[] var2, boolean var3, int var4, int[] var5, Object[] var6, int var7, int var8, int var9, int var10) {
      ++a;
      vt.a(var2, (int)-119);
      np.a(1, ah.f, var6, var10, var2, vk.f, var0, var8 * var7);
      ((int[])((int[])var2[1]))[3] = var7;
      if(var1 < 101) {
         e = 21;
      }

      ((int[])((int[])var2[1]))[4] = var8;
      if(var3) {
         int[] var11 = new int[var5.length];

         for(int var12 = 0; var8 > var12; ++var12) {
            int var13 = var7 * var12;
            int var14 = (-1 + -var12 + var8) * var7;
            if(var6 != null && 21 == var6.length && var6[15].equals(Boolean.valueOf(false))) {
               return null;
            }

            for(int var15 = 0; var7 > var15; ++var15) {
               var11[var13++] = var5[var14++];
            }
         }

         if(null != var6 && (var6.length == 2 || var6.length == 14 && var6[13].equals(Integer.valueOf(1)) && var6[13].equals(Boolean.valueOf(false)) || var6.length == 4)) {
            wfa.a(-103, (Object[])null, 92);
         }

         var5 = var11;
      }

      moa.a((byte)125, var2, (Object[])((Object[])var2[4]));
      if('\u84f5' != ((int[])((int[])var2[1]))[2] && var0 && var9 == 0 && 0 == var4) {
         ega.a(-768979816, '\u80e1', ((int[])((int[])var2[1]))[3], bu.a(44, (Object[])((Object[])var2[5]), (Object[])((Object[])var2[2])), ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[37], ((int[])((int[])var2[1]))[2], var5, ((int[])((int[])var2[1]))[4]);
         nb.a(false, true, var2);
      } else {
         OpenGL.glPixelStorei(3314, var9);
         OpenGL.glTexImage2Di(((int[])((int[])var2[1]))[2], 0, bu.a(48, (Object[])((Object[])var2[5]), (Object[])((Object[])var2[2])), ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[4], 0, '\u80e1', ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[37], var5, 4 * var4);
         OpenGL.glPixelStorei(3314, 0);
         nb.a(false, false, var2);
      }

      gg.a((byte)-38, var2, true);
      return var2;
   }

   static final void a(Object[] var0, byte var1) {
      if(-1 != ~((int[])((int[])var0[1]))[0] && -2 != ~cf.a((int)74, (Object[])((Object[])((Object[])((Object[])var0[0]))[3]))) {
         ((int[])((int[])var0[1]))[0] = 0;
      }

      ++f;
      if(var1 > 99) {
         if(-1 != ~((int[])((int[])var0[1]))[0] && -3 == ~dua.a((Object[])((Object[])((Object[])((Object[])var0[0]))[35]), (byte)-78)) {
            ((int[])((int[])var0[1]))[0] = 0;
         }

         if(-1 < ~((int[])((int[])var0[1]))[0] || ((int[])((int[])var0[1]))[0] > 1) {
            ((int[])((int[])var0[1]))[0] = uha.a(6462, var0);
         }

      }
   }

}
