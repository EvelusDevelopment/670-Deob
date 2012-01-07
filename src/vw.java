import jaggl.OpenGL;

final class vw {

   static int c;
   static Object[] e = lga.a(1, new Object[3], "stellardawn", 1, "Stellar Dawn");
   static int b;
   static int f;
   static String f_i;
   private Object[] a;
   static int g;
   static int d;
   static int h;


   static final boolean a(Object[] var0, long var1, int var3, byte var4, int var5) {
      ++d;
      if(var4 < 97) {
         a(((int[])((int[])e[1]))[0], (Object[])null, (Object[])((Object[])e[2]));
      }

      return baa.a(false, var0, var1, var3, var5);
   }

   public final String toString() {
      ++f;
      return sb.a(this.a, 0);
   }

   static final long b(int var0, Object[] var1) {
      ++c;
      long[] var2 = ph.d;
      long var3 = -1L;
      var3 = var2[(int)(255L & (var3 ^ (long)((int[])((int[])var1[1]))[3]))] ^ var3 >>> 8;
      var3 = var3 >>> 8 ^ var2[(int)(255L & ((long)(((int[])((int[])var1[1]))[0] >> 8) ^ var3))];
      var3 = var2[(int)(255L & (var3 ^ (long)((int[])((int[])var1[1]))[0]))] ^ var3 >>> 8;
      var3 = var3 >>> 8 ^ var2[(int)(255L & ((long)(((int[])((int[])var1[1]))[1] >> 24) ^ var3))];
      if(var0 < 114) {
         ((byte[])((byte[])((Object[])((Object[])var1[0]))[3]))[7] = 38;
      }

      var3 = var2[(int)(((long)(((int[])((int[])var1[1]))[1] >> 16) ^ var3) & 255L)] ^ var3 >>> 8;
      var3 = var2[(int)(255L & (var3 ^ (long)(((int[])((int[])var1[1]))[1] >> 8)))] ^ var3 >>> 8;
      var3 = var3 >>> 8 ^ var2[(int)(((long)((int[])((int[])var1[1]))[1] ^ var3) & 255L)];
      var3 = var3 >>> 8 ^ var2[(int)((var3 ^ (long)((int[])((int[])var1[1]))[2]) & 255L)];
      var3 = var2[(int)(255L & (var3 ^ (long)(((int[])((int[])var1[1]))[5] >> 24)))] ^ var3 >>> 8;
      var3 = var3 >>> 8 ^ var2[(int)(((long)(((int[])((int[])var1[1]))[5] >> 16) ^ var3) & 255L)];
      var3 = var2[(int)(255L & (var3 ^ (long)(((int[])((int[])var1[1]))[5] >> 8)))] ^ var3 >>> 8;
      var3 = var2[(int)(255L & (var3 ^ (long)((int[])((int[])var1[1]))[5]))] ^ var3 >>> 8;
      var3 = var2[(int)(255L & (var3 ^ (long)((int[])((int[])var1[1]))[4]))] ^ var3 >>> 8;
      var3 = var3 >>> 8 ^ var2[(int)(255L & (var3 ^ (long)(!((boolean[])((boolean[])var1[0]))[0]?0:1)))];
      if(var1 != null && 1 == var1.length && var1[0].equals(Boolean.valueOf(false))) {
         nca.a((Object[])null, 18);
      }

      return var3;
   }

   static final uma a(int var0, Object[] var1) {
      if(var0 != 1) {
         return (uma)null;
      } else {
         ++b;
         return new uma(var1);
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2, int var3, int var4, byte var5, int var6) {
      ++h;
      if(var1 != null && -88 == ~var1.length) {
         li.a(var2, 31961, var4, var0, var6, var1, var3);
      } else if(var1 != null && var1.length == 91) {
         byte var7;
         int var8;
         if(var0 != rma.a) {
            if(var0 == qv.k) {
               var7 = 3;
               var8 = var6 + 1;
            } else if(vqa.j != var0) {
               if(var0 == dw.a) {
                  var7 = 6;
                  var8 = var6 + 2;
               } else if(var0 == ah.f_i) {
                  var7 = 5;
                  var8 = 2 + var6;
               } else {
                  var8 = var6;
                  var7 = 0;
               }
            } else {
               var7 = 4;
               var8 = 3 * var6;
            }
         } else {
            var7 = 1;
            var8 = var6 * 2;
         }

         Object[] var9 = mha.a((Object[])((Object[])var1[78]), true);
         OpenGL.glDrawElements(var7, var8, ac.a(true, var9), dj.a((Object[])((Object[])var1[78]), (int)1) + (long)(var3 * ((int[])((int[])var9[0]))[1]));
      } else if(var5 < -117) {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++g;
      if(var0 != 0) {
         a((Object[])((Object[])((Object[])((Object[])var1[24]))[11]), (Object[])((Object[])var1[0]), -95, -70, -12, (byte)91, ((int[])((int[])var1[0]))[7]);
      }

      if(null != var1 && 5 == var1.length) {
         Object[] var4 = new Object[3];
         kua.a((byte)121, var4);
         ((byte[])((byte[])var4[0]))[0] = ((byte[])((byte[])var1[4]))[0];
         var4[2] = var1[2];
         ((int[])((int[])var4[1]))[0] = ((int[])((int[])var1[1]))[0];
         if(var2[0] == null || ~((Object[])((Object[])var2[0])).length >= ~((int[])((int[])var2[1]))[0]) {
            jm.a(var2, ((int[])((int[])var2[1]))[0] + 5, -121);
         }

         Object[][] var10000 = (Object[][])((Object[][])var2[0]);
         int[] var10001 = (int[])((int[])var2[1]);
         int var10004 = ((int[])((int[])var2[1]))[0];
         var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
         var10000[var10004] = var4;
         var2[7] = null;
      } else if(var1 != null && -4 == ~var1.length) {
         vra.a(var2, ((int[])((int[])var1[1]))[0], (byte)-106);
      } else if(var1 != null && -5 == ~var1.length) {
         hv.a(var1, var2, (byte)-97);
      } else if(var1 != null && -7 == ~var1.length) {
         wha.a(var2, false, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   vw(Object[] var1) {
      this.a = var1;
   }

}
