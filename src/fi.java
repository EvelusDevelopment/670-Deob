
final class fi {

   static int d;
   static int b;
   static int e;
   static int a;
   static int g;
   static int c;
   static int h;
   static Object[] f_i = st.a(new Object[1], 7, 60, 12);
   static Object[] f = sd.a(new Object[1], 21, (byte)111);


   static final void a(int var0, int var1, byte var2, int var3) {
      ++e;
      String var4 = "tele " + var0 + wu.o + (var1 >> 6) + wu.o + (var3 >> 6) + wu.o + (63 & var1) + wu.o + (63 & var3);
      if(var2 < -102) {
         System.out.println(var4);
         it.a(false, (byte)126, true, var4);
      }
   }

   static final void a(Object[] var0, ta var1, int var2) {
      ++b;
      fla.a((Object[])((Object[])var0[19]), var2 ^ 16802, var1);
      if(var2 != 16854) {
         a((Object[])null, (ta)((Object[])((Object[])f_i[3]))[11], -21);
      }

   }

   static final void a(int var0, Object[] var1) {
      if(var1[0] == null) {
         var1[0] = new int[1];
      }

      if(var0 >= 104) {
         ++h;
      }
   }

   static final re a(int var0, int var1, int var2, Object[] var3) {
      if(var1 != 5) {
         a((Object[])((Object[])var3[9]), -111);
      }

      ++a;
      Object[] var4;
      return (re)(null == (var4 = tca.a(false, var3, new Object[5], var0, hf.d, vk.f, var2))?null:var4[4]);
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 3) {
         a((int)83, (Object[])null);
      }

      if(((boolean[])((boolean[])((Object[])((Object[])var0[0]))[17]))[0] && ((boolean[])((boolean[])((Object[])((Object[])var0[0]))[17]))[3] && var0[1] == null) {
         Object[] var2 = rna.a((Object[])((Object[])var0[0]), '\u8b30', "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", -21129);
         if(var2 != null) {
            var0[1] = vga.a((Object[])((Object[])var0[0]), false, new Object[][]{var2});
         }
      }

      ++d;
      return null != var0[1];
   }

   static final int a(boolean var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7) {
      ++c;
      int var8 = 0;
      if(!var0) {
         a((int)58, (Object[])null);
      }

      float var11;
      float var12;
      label73: {
         float var9 = (float)var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[10] + (float)var4 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[2] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[14] + (float)var1 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[6];
         float var10 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[10] * (float)var6 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[6] * (float)var3 + (float)var7 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[2] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[14];
         var11 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[15] + (float)var4 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[3] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[7] * (float)var1 + (float)var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[11];
         var12 = (float)var6 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[11] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[15] + (float)var7 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[3] + (float)var3 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[7];
         if(var9 >= -var11 || -var12 <= var10) {
            if(var9 <= var11 || var10 <= var12) {
               break label73;
            }

            var8 |= 32;
            if(client.f_vb == 0) {
               break label73;
            }
         }

         var8 |= 16;
      }

      float var13 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[0] * (float)var4 + (float)var1 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[4] + (float)var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[8];
      float var14 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[8] * (float)var6 + (float)var3 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[4] + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[12] + (float)var7 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[0];
      if(var13 < -var11 && -var12 > var14) {
         var8 |= 1;
      }

      if(var11 < var13 && var12 < var14) {
         var8 |= 2;
      }

      float var15 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[1] * (float)var4 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[13] + (float)var1 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[5] + (float)var2 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[9];
      float var16 = ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[9] * (float)var6 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[1] * (float)var7 + ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[13] + (float)var3 * ((float[])((float[])((Object[])((Object[])var5[16]))[0]))[5];
      if(-var11 > var15 && var16 < -var12) {
         var8 |= 4;
      }

      if(var15 > var11 && var16 > var12) {
         var8 |= 8;
      }

      return var5 != null && (3 == var5.length && var5[1].equals(Boolean.valueOf(false)) || 16 == var5.length)?40:var8;
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 <= 111) {
         ((boolean[])((boolean[])f[6]))[2] = ((boolean[])((boolean[])((Object[])((Object[])f[19]))[0]))[8];
      }

      ++g;
      return ((int[])((int[])var1[1]))[4];
   }

}
