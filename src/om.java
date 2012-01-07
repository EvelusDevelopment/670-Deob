import jaggl.OpenGL;

final class om {

   static int f;
   static int e;
   static int b;
   static int a;
   static int c;
   static int[] d = new int[64];
   static cga g;


   static final void a(int var0, int var1, int var2, Object[] var3, int var4) {
      ++a;
      bw.a(-1, var0, var3, var1, 64);
      Object[] var9;
      if(0 != (((int[])((int[])var3[9]))[var0] & 2)) {
         mt var5;
         mt var6;
         for(var9 = (var5 = (mt)od.a(2, (Object[])((Object[])((Object[])((Object[])var3[4]))[0]))) == null?null:var5.n; null != var9; var9 = (var6 = (mt)hga.b((Object[])((Object[])((Object[])((Object[])var3[4]))[0]), var4 ^ 14570)) == null?null:var6.n) {
            if(((int[])((int[])var9[1]))[3] == var0 && 0 > ((int[])((int[])var9[1]))[13]) {
               ((Object[][][])((Object[][][])var3[25]))[var0][((int[])((int[])var9[1]))[16]] = null;
               ((Object[][][])((Object[][][])var3[25]))[var0][var1] = var9;
               int var10 = ((int[])((int[])var9[1]))[9] + (((int[])((int[])var9[1]))[8] * ((int[])((int[])var9[1]))[2] >> 12);
               ((int[])((int[])var9[1]))[9] += var1 - ((int[])((int[])var9[1]))[16] << 8;
               ((int[])((int[])var9[1]))[2] = 4096;
               ((int[])((int[])var9[1]))[8] = var10 + -((int[])((int[])var9[1]))[9];
               ((int[])((int[])var9[1]))[16] = var1;
               return;
            }
         }

         if(var3 != null && -34 == ~var3.length) {
            return;
         }
      }

      hka var7;
      var9 = null == (var7 = (hka)pm.a((long)((int[])((int[])var3[3]))[var0], (Object[])((Object[])var3[2]), false))?null:var7.p;
      if(null != var9) {
         hb var13 = ((hb[])((hb[])var9[8]))[var1];
         if(var13 != null) {
            Object[] var11 = mga.a(new Object[6], (byte)-99);
            var11[5] = var9;
            var11[3] = var13;
            ((int[])((int[])var11[1]))[3] = var0;
            var11[4] = ((Object[])((Object[])var9[0]))[var1];
            ((int[])((int[])var11[1]))[6] = ((byte[])((byte[])var9[2]))[var1];
            if(var3 != null && 3 == var3.length && var3[2].equals(Integer.valueOf(1))) {
               rja.a((Object[])null, (int)2);
            }

            ((int[])((int[])var11[1]))[16] = var1;
            ((int[])((int[])var11[1]))[11] = ((int[])((int[])var9[1]))[0] * var2 * var2 * ((byte[])((byte[])var9[6]))[var1] + 1024 >> 11;
            ((int[])((int[])var11[1]))[7] = ((byte[])((byte[])var9[4]))[var1] & 255;
            ((int[])((int[])var11[1]))[9] = (var1 << 8) - (32767 & ((short[])((short[])var9[3]))[var1]);
            ((int[])((int[])var11[1]))[15] = 0;
            ((int[])((int[])var11[1]))[13] = -1;
            ((int[])((int[])var11[1]))[12] = var4;
            ((int[])((int[])var11[1]))[0] = 0;
            ((int[])((int[])var11[1]))[10] = 0;
            if(0 != ((int[])((int[])var3[20]))[var0]) {
               var11[0] = on.a(var13, to.a(var11, var3, 4), 0, qga.a(var11, (byte)122, var3));
               vv.a(var11, 124, ((short[])((short[])var9[3]))[var1] < 0, var3);
            } else {
               var11[0] = on.a(var13, to.a(var11, var3, 4), br.a(var11, var3, var4 + 1), qga.a(var11, (byte)122, var3));
            }

            if(((short[])((short[])var9[3]))[var1] < 0) {
               ((on)var11[0]).e(-1);
            }

            if(0 <= ((int[])((int[])var11[1]))[6]) {
               Object[] var12 = ((Object[][][])((Object[][][])var3[21]))[var0][((int[])((int[])var11[1]))[6]];
               if(var12 != null && ((int[])((int[])var12[1]))[13] < 0) {
                  ((Object[][][])((Object[][][])var3[25]))[var0][((int[])((int[])var12[1]))[16]] = null;
                  ((int[])((int[])var12[1]))[13] = 0;
               }

               ((Object[][][])((Object[][][])var3[21]))[var0][((int[])((int[])var11[1]))[6]] = var11;
            }

            client.a(var4 + 117, (Object[])((Object[])((Object[])((Object[])var3[4]))[0]), (lm)(var11 == null?null:var11[2]));
            ((Object[][][])((Object[][][])var3[25]))[var0][var1] = var11;
         }
      }
   }

   static final lua a(int var0, int var1, int var2, Object[] var3) {
      if(var0 != -31525) {
         a((Object[])null, false);
      }

      ++c;
      if(var3 != null && var3.length == 87) {
         Object[] var5;
         lua var4 = (lua)((var5 = ge.a(new Object[5], var1, (byte)124, var3, vk.b, var2)) == null?null:var5[3]);
         return var4;
      } else if(null != var3 && var3.length == 91) {
         return pba.a(var2, var1, var3, -116);
      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, int var3, Object[] var4, int var5, Object[] var6) {
      ++f;
      esa.a(var2, 1);
      bca.a((byte)125, var6, var1, var3 * var5, var2, var4, 3553, false);
      ((int[])((int[])var2[1]))[4] = var3;
      ((int[])((int[])var2[1]))[3] = var5;
      if(var0 < 112) {
         a((Object[])null, ((boolean[])((boolean[])var4[8]))[1]);
      }

      ah.a((Object[])((Object[])var2[5]), var2, (byte)112);
      OpenGL.glTexImage2Dub(((int[])((int[])var2[1]))[2], 0, vb.a(-103, (Object[])((Object[])var2[3]), (Object[])((Object[])var2[6])), var3, var5, 0, fv.a((Object[])((Object[])var2[6]), (int)0), ac.a(true, (Object[])((Object[])var2[3])), (byte[])null, 0);
      return var2;
   }

   static final nj a(Object[] var0, boolean var1) {
      ++e;
      if(var1) {
         a(107, (Object[])null, false);
      }

      nj var2 = ((nj)var0[0]).f;
      if(var0[0] == var2) {
         var0[1] = null;
         return null;
      } else {
         var0[1] = var2.f;
         return var2;
      }
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      int var3 = 121 / ((-55 - var0) / 37);
      ++b;
   }

}
