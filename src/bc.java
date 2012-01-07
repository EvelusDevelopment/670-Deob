import jagdx.D3DCAPS;

final class bc extends lm {

   static int j;
   static int n;
   static int f_l;
   static int k;
   Object[] m;


   bc(Object[] var1) {
      this.m = var1;
   }

   static final void a(int[] var0, int var1, int[] var2) {
      ++f_l;
      if(null != var0 && null != var2) {
         vh.f = var0;
         im.h = new int[var0.length];
         int var3 = -11 / ((5 - var1) / 52);
         uqa.a = new byte[var0.length][][];

         for(int var4 = 0; vh.f.length > var4; ++var4) {
            uqa.a[var4] = new byte[var2[var4]][];
         }

      } else {
         uqa.a = (byte[][][])null;
         im.h = null;
         vh.f = null;
      }
   }

   static final void a(int var0, int var1) {
      ++k;
      Object[] var2 = la.a(0, (long)var1, 9);
      if(var0 != -12112) {
         a((int[])null, -17, (int[])null);
      }

      aia.a(var2, 1);
   }

   static final boolean a(Object[] var0, byte var1) {
      ++n;
      if(var1 <= 65) {
         return ((boolean[])((boolean[])var0[2]))[4];
      } else if(null == var0) {
         throw new IllegalStateException();
      } else {
         boolean var4 = ((boolean[])((boolean[])((Object[])((Object[])var0[0]))[63]))[19];
         if(var4) {
            Object[] var6 = (Object[])((Object[])var0[0]);
            boolean var5;
            boolean var7;
            if(null != var6 && var6.length == 87) {
               var7 = 257 <= (((D3DCAPS)var6[77]).PixelShaderVersion & '\uffff');
               var5 = var7;
            } else {
               if(null == var6 || 91 != var6.length) {
                  throw new IllegalStateException();
               }

               var7 = ((boolean[])((boolean[])var6[63]))[21];
               var5 = var7;
            }

            var4 = var5;
         }

         boolean var2;
         if(!var4) {
            var2 = false;
         } else {
            var0[4] = fk.a("FilterBloom", 5846, (Object[])((Object[])var0[0]));
            if(var0[4] == null) {
               var2 = false;
            } else {
               try {
                  var0[9] = kt.a(-18810, (Object[])((Object[])var0[4]), "sceneTex");
                  var0[12] = kt.a(-18810, (Object[])((Object[])var0[4]), "bloomTex1");
                  if(var0 != null && (var0.length == 20 || var0.length == 11)) {
                     pja.a((byte)-114, (Object[])null);
                  }

                  var0[7] = kt.a(-18810, (Object[])((Object[])var0[4]), "params");
                  var0[5] = kt.a(-18810, (Object[])((Object[])var0[4]), "sampleSize");
                  var0[13] = kt.a(-18810, (Object[])((Object[])var0[4]), "pixelOffsetAndBloomScale");
                  var0[10] = kt.a(-18810, (Object[])((Object[])var0[4]), "PosAndTexCoords");
                  lca.a((Object[])((Object[])var0[4]), (byte)117, "test");
                  var0[11] = lca.a((Object[])((Object[])var0[4]), (byte)117, "techFullscreenTri");
                  var0[6] = lca.a((Object[])((Object[])var0[4]), (byte)117, "brightpass");
                  var0[2] = lca.a((Object[])((Object[])var0[4]), (byte)117, "blur");
                  var0[3] = lca.a((Object[])((Object[])var0[4]), (byte)117, "composite");
                  var0[8] = lca.a((Object[])((Object[])var0[4]), (byte)117, "techDefault");
               } catch (bma var8) {
                  var2 = false;
                  return var2;
               } catch (mo var9) {
                  var2 = false;
                  return var2;
               }

               if(!ui.f((Object[])((Object[])var0[11]), -41)) {
                  var2 = false;
               } else if(ui.f((Object[])((Object[])var0[6]), -53)) {
                  if(!ui.f((Object[])((Object[])var0[2]), -108)) {
                     var2 = false;
                  } else if(!ui.f((Object[])((Object[])var0[3]), -88)) {
                     var2 = false;
                  } else if(ui.f((Object[])((Object[])var0[8]), -95)) {
                     var2 = true;
                     ((boolean[])((boolean[])var0[1]))[1] = true;
                  } else {
                     var2 = false;
                  }
               } else {
                  var2 = false;
               }
            }
         }

         return var2;
      }
   }

}
